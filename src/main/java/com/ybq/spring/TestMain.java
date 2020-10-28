package com.ybq.spring;

import com.ybq.spring.bean.ABean;
import com.ybq.spring.bean.Product;
import com.ybq.spring.bean.User;
import com.ybq.spring.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
//        Object user1 = applicationContext.getBean("user");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
//        User user1 = applicationContext.getBean("user", User.class);
//        System.out.println(user1);
//        applicationContext.close();
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
        ABean aBean = applicationContext.getBean("ABean", ABean.class);
        System.out.println(aBean);
        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println(userController);
        System.out.println(userController.userservice);
        userController.sayHello();
    }
}
