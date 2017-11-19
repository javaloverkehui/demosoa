package com.example.demo.config;

import lombok.Getter;

/**
 * Created by kehui on 2017/11/19.
 */
public enum DataSourceType {
    read("read", "从库"),
    write("write", "主库");
    @Getter
    private String type;
    @Getter
    private String name;

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
