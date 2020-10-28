package com.ybq.spring.controller;

import com.ybq.spring.service.Userservice;
import com.ybq.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//jsr250
import javax.annotation.Resource;

@Controller
public class UserController {
    // @Autowired 作用引入其他容器中的对象
//    @Autowired(required = true)
//    @Resource(name = "userService",type = UserServiceImpl.class)
    @Autowired
    @Qualifier("userService")
    public Userservice userservice;

    /*@Autowired
    public void setUserservice(Userservice userservice) {
        this.userservice = userservice;
    }

    @Autowired
    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }
*/
    public void sayHello() {
        userservice.save();
    }
}
