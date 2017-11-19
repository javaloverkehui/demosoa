package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dao.read.custom.AbcDao;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kehui on 2017/11/19.
 */
@Service
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private AbcDao abcDao;
    @Override
    public String getSiteUrl() {
        return abcDao.getSite().getSiteUrl();
    }
}
