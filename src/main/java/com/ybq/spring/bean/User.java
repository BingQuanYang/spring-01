package com.ybq.spring.bean;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private Address address;
    private List list;
    private Map map;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User() {
        System.out.println(111);
    }

    /**
     * 初始化方法是构造方法执行之后自动执行的第一个方法
     */
    public void init(){
        System.out.println("init");
        username = "张三";
    }

    public void destroy(){
        System.out.println("destroy");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
