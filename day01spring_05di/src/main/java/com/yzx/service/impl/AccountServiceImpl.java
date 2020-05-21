package com.yzx.service.impl;

import com.yzx.service.IAccountService;

import java.util.Date;

/**
 * @program: day01spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-05-20 23:14
 */
public class AccountServiceImpl implements IAccountService {
    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。"+name+","+age+","+birthday);
    }

}
