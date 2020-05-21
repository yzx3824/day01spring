package com.yzx.dao.impl;

import com.yzx.dao.IAccountDao;

/**
 * @program: day01spring
 * @description: 账户的持久层实现类
 * @author: yanzhixian
 * @create: 2020-05-19 23:35
 */
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
