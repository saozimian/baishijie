package com.codehuan.controller;


import com.codehuan.pojo.Result;
import com.codehuan.pojo.User;
import com.codehuan.service.UserService;
import com.codehuan.vo.CodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 获取单个用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/getUserInfo/{id}")
    public Result getUserInfoById(@PathVariable String id) {

        User user = userService.getUserInfoById(id);
        log.info("user=" + user);
        return new Result<>(CodeEnum.SUCCESS, user);
    }

    /**
     * 获取所有用户信息 status = 1
     *
     * @return
     */
    @GetMapping("/getAllUserInfo")
    public Result getAllUserInfo() {

        List<User> user = userService.getAllUserInfo();
        log.info("user=" + user);
        return new Result<>(CodeEnum.SUCCESS, user);
    }


    /**
     * 获取所有用户信息 status = 0
     *
     * @return
     */
    @GetMapping("/getAllUserInfo")
    public Result getAllUserInfo() {

        List<User> user = userService.getAllUserInfo();
        log.info("user=" + user);
        return new Result<>(CodeEnum.SUCCESS, user);
    }

}
