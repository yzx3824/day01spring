package com.yzx.ui;

import com.yzx.factory.BeanFactory;
import com.yzx.service.IAccountService;
import com.yzx.service.impl.AccountServiceImpl;

/**
 * @program: day01spring
 * @description: 模拟一个表现层，用于调用业务层
 * @author: yanzhixian
 * @create: 2020-05-19 23:35
 */
public class Client {
    public static void main(String[] args) {
//        IAccountService as = new AccountServiceImpl();
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
    }
}
