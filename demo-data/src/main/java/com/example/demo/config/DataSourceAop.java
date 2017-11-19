package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by kehui on 2017/11/19.
 */
@Component
@Slf4j
@Aspect
public class DataSourceAop {
    @Before("execution(* com.example.demo.dao.read..*.*(..))")
    public void setReadDataSourceType() {
        DataSourceContextHolder.read();
        log.info(Thread.currentThread().getId() + "dataSource change to Read");
    }

    @Before("execution(* com.example.demo.dao.write..*.*(..))")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.write();
        log.info(Thread.currentThread().getId() + "dataSource change to write");
    }
}
