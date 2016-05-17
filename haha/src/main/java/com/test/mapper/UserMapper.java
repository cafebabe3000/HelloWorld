package com.test.mapper;

import com.test.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public interface UserMapper {
    public List<User> selectAll();
}
