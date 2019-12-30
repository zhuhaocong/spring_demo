package com.zhc.service.impl;

import com.zhc.dao.UserDao;
import com.zhc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl(){}

    public UserServiceImpl(UserDao userDao) {
        this.userDao=userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
