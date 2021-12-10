package com.itlx.service.impl;

import com.itlx.dao.UserDao;
import com.itlx.service.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class userServiceImpl implements userService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void using() {

        userDao.use();
    }
}
