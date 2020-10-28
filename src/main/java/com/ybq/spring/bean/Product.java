package com.ybq.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 *Component
 * 作用 往容器中注册对象，在类上使用
 *  value
 *      -给容器中bean指定名字，如果不指定则类名首字母小写
 * 注解 默认值是类名首字母小写
 *
 *
 *
 * @Service  声明在service层
 * @Repository 声明在dao层
 * @Controller 声明在控制层
 */
@Component("product")
public class Product {
    private String name;
    private BigDecimal price;
}

