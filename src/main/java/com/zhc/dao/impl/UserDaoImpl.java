package com.zhc.dao.impl;

import com.zhc.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("实现保存");
    }
}
