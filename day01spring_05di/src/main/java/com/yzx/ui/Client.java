package com.yzx.ui;

import com.yzx.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @program: day01spring
 * @description: 模拟一个表现层，用于调用业务层
 * @author: yanzhixian
 * @create: 2020-05-20 23:15
 */
public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
//        IAccountService as  = (IAccountService)ac.getBean("accountService");
//        IAccountService as  = (IAccountService)ac.getBean("accountService2");
        IAccountService as  = (IAccountService)ac.getBean("accountService3");
        System.out.println(as);
        as.saveAccount();
    }
}
