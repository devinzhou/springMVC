package com.test.pluto.service;

import com.test.pluto.mapper.UserMapper;
import com.test.pluto.model.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserUsingId(String id) {

        if (userMapper == null) {
            return new User();
        }

        User user = userMapper.getUserUsingId(Integer.parseInt(id));

        if (user == null) {
            user =  new User();

            user.setId("-1");
            user.setCommand("not found USER");
        }

        System.out.println(user.toString());
        return user;
    }
}
