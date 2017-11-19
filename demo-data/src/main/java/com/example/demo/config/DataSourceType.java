package com.example.demo.config;

import lombok.Getter;

/**
 * Created by kehui on 2017/11/19.
 */
public enum DataSourceType {
    read("custom", "从库"),
    write("mbg", "主库");
    @Getter
    private String type;
    @Getter
    private String name;

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
