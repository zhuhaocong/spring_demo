package com.zhc.jdkproxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoProxy {
    private TargetInterface proxy;
    public void setProxy(){
        Target target = new Target();
        proxy=(TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("风景");
                        Object invoke = method.invoke(target, args);
                        System.out.println("图片大小");
                        return invoke;
                    }
                }
        );
    }
    @Test
    public void test(){
        setProxy();
        proxy.show();
    }

}
