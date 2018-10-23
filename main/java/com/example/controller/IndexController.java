package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: springboot_demo
 * @BelongsPackage: com.example.controller
 * @Author: yaox
 * @CreateTime: 2018-10-23 10:07
 */
@RestController
public class IndexController {
    @Autowired
    UserService userService;
    @GetMapping("/show")
    public List<Users> getUser(int age){
        return userService.getUser(age);
    }

    @RequestMapping(value = "/index")
    @ResponseBody
    public Map<String,String> index(){
        Map map=new HashMap<String,String>();
        map.put("北京","北方城市" );
        map.put("深圳","南方城市" );
        return map;
    }
}
