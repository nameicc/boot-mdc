package com.nameicc.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.nameicc.controller.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        // traceId
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        String traceId = signature.getMethod().getName() + "-" + System.currentTimeMillis();
        MDC.put("_traceId", traceId);
        log.info("traceId:{}", traceId);

        Object object = pjp.proceed();
        long end = System.currentTimeMillis();
        log.info("执行方法耗时{}ms", end - start);
        return object;
    }

}
