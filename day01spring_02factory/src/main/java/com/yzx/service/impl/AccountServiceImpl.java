package com.yzx.service.impl;

import com.yzx.dao.IAccountDao;
import com.yzx.dao.impl.AccountDaoImpl;
import com.yzx.factory.BeanFactory;
import com.yzx.service.IAccountService;

/**
 * @program: day01spring
 * @description: 账户的业务层实现类
 * @author: yanzhixian
 * @create: 2020-05-19 23:33
 */
public class AccountServiceImpl implements IAccountService {
//    private IAccountDao accountDao = new AccountDaoImpl();
    private IAccountDao accountDao = (IAccountDao)BeanFactory.getBean("accountDao");

    //    private int i = 1;
    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
