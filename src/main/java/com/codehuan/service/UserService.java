package com.codehuan.service;

import com.codehuan.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
public interface UserService extends IService<User> {

    User getUserInfoById(String id);

    List<User> getAllUserInfo();
}
