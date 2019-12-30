package com.zhc.jdkproxy;

public class Target implements TargetInterface {
    @Override
    public void show() {
        System.out.println("这是一张图片");
    }
}
