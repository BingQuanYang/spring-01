package com.ybq.spring.service.impl;

import com.ybq.spring.service.Userservice;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Primary 当一个接口有多个实现的时候可以在类使用@Primary来表示优先使用
 */
@Service
@Primary
public class UserServiceImpl2 implements Userservice {

    @Override
    public int save() {
        System.out.println("hello");
        return 0;
    }
}
