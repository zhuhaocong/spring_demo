package com.zhc.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.zhc.aopdemo..*.*(..))")
    public void myPoint(){}

//    @Before("MyAspect.myPoint()")
    public void before(){
        System.out.println("壮美");
    }

    @Around("MyAspect.myPoint()")
    public Object around(ProceedingJoinPoint point ){
        System.out.println(point);
        System.out.println(point.getSignature());//方法签名
        System.out.println(point.getThis());

        //获得参数列表
        Object[] args = point.getArgs();
        System.out.println(args[0]);

        try{
            System.out.println("山前");
            //执行目标方法
            Object proceed = point.proceed();
            System.out.println("水后");
        }catch (Throwable throwable){
            System.out.println("异常");
        }finally{
            System.out.println("最终");
        }


        return 23333;
    }


}
