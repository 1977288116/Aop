package com.chenjl.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* *com.chenjl.performance.Performance.perform(..))")
    public void performance(){};

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.printf("CLAP CLAP CLAP！！！");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    // 环绕通知（可替代上面的四个方法）
    @Around("performance()")
    public void wathcPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.printf("CLAP CLAP CLAP！！！");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }

}
