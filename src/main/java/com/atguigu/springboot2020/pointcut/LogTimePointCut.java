package com.atguigu.springboot2020.pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LogTimePointCut {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut(value = "@annotation(com.atguigu.springboot2020.annotation.LogTime)")
    public void logTimePointCut() {
    }

    @Around(value = "logTimePointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        long startTime = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(pjp.getSignature().getName());
        Object proceed = pjp.proceed();
//        long endTime = System.currentTimeMillis();
        stopWatch.stop();
//        logger.info(pjp.getSignature().getName() + "()方法耗时: " + stopWatch.getLastTaskTimeMillis() + "ms");
        logger.info(stopWatch.getLastTaskName() + "()方法耗时: " + stopWatch.getLastTaskTimeMillis() + "ms");
        return proceed;
    }
}
