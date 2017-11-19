package com.example.demo.proxy;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Component;

/**
 * Created by kehui on 2017/11/19.
 */
@Component
public class TestProxy {

    @Reference(version = "0.0.1", group = "test")
    private TestService testService;

    public String test() {
        return testService.getSiteUrl() + "--------------------------------------";
    }
}
