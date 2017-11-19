package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by kehui on 2017/11/19.
 */
@Slf4j
public class DataSourceContextHolder {
    private static final ThreadLocal<String> local = new ThreadLocal<>();

    public static void read() {
        local.set(DataSourceType.read.getType());
        System.out.println("------------------------------------thread ---" + Thread.currentThread().getId());
    }

    public static void write() {
        local.set(DataSourceType.write.getType());
    }

    public static String getJdbcType() {
        return local.get();
    }
}
