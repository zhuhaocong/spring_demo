package com.zhc.factory;

import com.zhc.dao.UserDao;
import com.zhc.dao.impl.UserDaoImpl;

public class StaticFactoryBean {
    public static UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
