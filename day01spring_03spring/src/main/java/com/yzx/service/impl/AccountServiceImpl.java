package com.yzx.service.impl;

import com.yzx.dao.IAccountDao;
import com.yzx.dao.impl.AccountDaoImpl;
import com.yzx.service.IAccountService;

/**
 * @program: day01spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-05-20 23:14
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
