package com.example.demo.dao.read.custom;

import com.example.demo.model.po.Site;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by kehui on 2017/11/19.
 */
public interface TestReadDao {

    //@Select("select * from site limit 1")
    Site getSite();
}
