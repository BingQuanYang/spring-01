package com.ybq.spring.service.impl;

import com.ybq.spring.service.Userservice;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements Userservice {

    @Override
    public int save() {
        System.out.println("hello");
        return 0;
    }
}
