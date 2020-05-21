package com.yzx.factory;

import com.yzx.service.IAccountService;
import com.yzx.service.impl.AccountServiceImpl;

/**
 * @program: day01spring
 * @description: 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 * @author: yanzhixian
 * @create: 2020-05-22 00:09
 */
public class InstanceFactory {
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
