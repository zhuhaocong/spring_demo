package com.zhc.factory;

import com.zhc.dao.UserDao;
import com.zhc.dao.impl.UserDaoImpl;

public class FactoryBean {
    public UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
