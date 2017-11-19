package com.example.demo.dao.read.custom;

import com.example.demo.model.po.Site;

/**
 * Created by kehui on 2017/11/19.
 */
public interface TestReadDao {

    //@Select("select * from site limit 1")
    Site getSite();
}
