package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dao.read.custom.AbcDao;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kehui on 2017/11/19.
 */
@Service(version = "0.0.1", group = "test")
public class TestServiceImpl implements TestService {
    @Autowired
    private AbcDao abcDao;
    @Override
    public String getSiteUrl() {
        return abcDao.getSite().getSiteUrl();
    }
}
