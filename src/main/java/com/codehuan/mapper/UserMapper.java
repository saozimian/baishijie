package com.codehuan.mapper;

import com.codehuan.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
