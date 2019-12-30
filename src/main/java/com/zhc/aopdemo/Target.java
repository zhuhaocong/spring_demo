package com.zhc.aopdemo;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {
    @Override
    public Object show(String string) {
        System.out.println("河山");
        return null;
    }
}
