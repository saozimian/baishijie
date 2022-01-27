package com.codehuan.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codehuan.pojo.User;
import com.codehuan.mapper.UserMapper;
import com.codehuan.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserInfoById(String id) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("workcode", id);
        return userMapper.selectOne(userQueryWrapper);
    }

    @Override
    public List<User> getAllUserInfo() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("status", 1);
        return userMapper.selectList(userQueryWrapper);
    }
}
