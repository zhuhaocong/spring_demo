package com.zhc.cglibproxy;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DemoProxy implements MethodInterceptor {
    //代理对象
    private Target proxy;
    //被代理对象
    private Target target;

    //设置代理对象
    public void setProxy(){
        this.target = new Target();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(this);

        proxy=(Target)enhancer.create();
    }

    //方法拦截器
    @Override
    public Object intercept(
            Object o,
            Method method,
            Object[] objects,
            MethodProxy methodProxy
    ) throws Throwable {
        System.out.println("风景");
        Object invoke = method.invoke(target, objects);
        System.out.println("图片4M");
        return invoke;
    }

    @Test
    public void test(){
        setProxy();
        proxy.show();
    }

}
