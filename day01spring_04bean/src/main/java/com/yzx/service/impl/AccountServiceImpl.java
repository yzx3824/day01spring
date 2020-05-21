package com.yzx.service.impl;

import com.yzx.service.IAccountService;

/**
 * @program: day01spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-05-20 23:14
 */
public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。");
    }

    public void init(){
        System.out.println("对象初始化了。。。");
    }
    public void destroy(){
        System.out.println("对象销毁了。。。");
    }
}
