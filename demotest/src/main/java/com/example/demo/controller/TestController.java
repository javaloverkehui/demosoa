package com.example.demo.controller;


import com.example.demo.proxy.TestProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kehui on 2017/11/19.
 */
@RestController
public class TestController {

    @Autowired
    private TestProxy testProxy;

    @RequestMapping("/test")
    public String test() {
        return testProxy.test();
    }
}
