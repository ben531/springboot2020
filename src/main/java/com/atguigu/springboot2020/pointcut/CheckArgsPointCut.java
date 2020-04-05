package com.atguigu.springboot2020.pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CheckArgsPointCut {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut(value = "@annotation(com.atguigu.springboot2020.annotation.CheckArgs)")
    public void checkArgs() {
    }

    @Around(value = "checkArgs()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        String methodName = pjp.getSignature().getName();
        logger.debug(methodName + "()方法的入参: " + Arrays.asList(args));
        return pjp.proceed();
    }
}
