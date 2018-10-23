package com.example.service;

import com.example.dao.UsersMapper;
import com.example.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: springboot_demo
 * @BelongsPackage: com.example.service
 * @Author: yaox
 * @CreateTime: 2018-10-23 10:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public List<Users> getUser(int age) {
        return usersMapper.getUser(age);
    }
}
