package com.atguigu.springboot2020.pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogTimePointCut {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut(value = "@annotation(com.atguigu.springboot2020.annotation.LogTime)")
    public void logTimePointCut() {
    }

    @Around(value = "logTimePointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        long endTime = System.currentTimeMillis();
        logger.info(pjp.getSignature().getName() + "方法耗时: " + (endTime - startTime) + "ms");
        return proceed;
    }
}
