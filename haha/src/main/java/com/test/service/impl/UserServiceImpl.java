package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
