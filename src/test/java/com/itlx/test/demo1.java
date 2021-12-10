package com.itlx.test;

import com.itlx.dao.UserDao;
import com.itlx.service.userService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class demo1 {
    @Test
    public void test01(){
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
//        System.out.println(userDao);
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService userService = (userService) app.getBean("userService");
        userService.using();
    }
}
