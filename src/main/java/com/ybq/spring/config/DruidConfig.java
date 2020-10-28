package com.ybq.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ybq.spring.bean.Address;
import com.ybq.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration
 * ssm 项目 xml + 注解方式
 * springboot java config + 注解方式
 */
@Configuration
public class DruidConfig {
    
    @Bean
    public User user (Address address){
        User user = new User();
        user.setUsername("test");
        user.setAddress(address);
        return user;
    }

    @Bean
    public Address address(){
        return new Address();
    }
}
