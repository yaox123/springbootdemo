package com.example.service;

import com.example.pojo.Users;

import java.util.List;

/**
 * @BelongsProject: springboot_demo
 * @BelongsPackage: com.example.service
 * @Author: yaox
 * @CreateTime: 2018-10-23 10:39
 */
public interface UserService {
    List<Users> getUser(int age);
}
