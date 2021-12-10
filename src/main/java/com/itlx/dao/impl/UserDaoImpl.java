package com.itlx.dao.impl;

import com.itlx.dao.UserDao;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("创建对象");
    }

    @Override
    public void use() {
        System.out.println("using");
    }
    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁");
    }
}
