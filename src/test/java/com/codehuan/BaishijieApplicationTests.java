package com.codehuan;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.codehuan.mapper.UserMapper;
import com.codehuan.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BaishijieApplicationTests {

    @Test
    void contextLoads() {
        // 0、表名
        List<String> tables = new ArrayList<>();
        tables.add("t_user");
        tables.add("t_question");
        tables.add("t_permission");
        tables.add("t_role");

        // 1、配置数据源
        FastAutoGenerator.create("jdbc:mysql://39.108.150.61:3306/haojixing", "root", "a815634a1936c7b2")
                // 2、全局配置
                .globalConfig(builder -> {
                    builder.author("Zhang Huan")               //作者
                            .outputDir(System.getProperty("user.dir") + "\\src\\main\\java")    //输出路径(写到java目录)
                            .enableSwagger()           //开启swagger
                            .commentDate("yyyy-MM-dd")
                            .fileOverride();            //开启覆盖之前生成的文件

                })
                //2、包配置
                .packageConfig(builder -> {
                    builder.parent("com.codehuan")
                            .entity("pojo")
                            .service("service")
                            .serviceImpl("service.Impl")
                            .controller("controller")
                            .mapper("mapper")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "\\src\\main\\resources\\mapper"));
                })
                // 4、策略配置
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .addTablePrefix("t_")
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            .enableBaseResultMap()  //生成通用的resultMap
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper");
                })
                // 5、模板引擎配置
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                //6、执行
                .execute();

    }


    @Autowired
    UserMapper userMapper;

    @Test
    public void testPage() {


        // 分页查第一页
        Page<User> page = new Page<>(1, 2);
        Page<User> pageResult = userMapper.testPage(page);
        System.out.println(JSON.toJSONString(pageResult));
        // 分页查第二页
        page = new Page<>(2, 2);
        pageResult = userMapper.testPage(page);
        System.out.println(JSON.toJSONString(pageResult));
    }

    @Test
    public void testPage2() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        Page<Map<String, Object>> mapPage = userMapper.selectMapsPage(new Page<>(1, 2), queryWrapper);
        System.out.println(JSON.toJSONString(mapPage));
    }

}
