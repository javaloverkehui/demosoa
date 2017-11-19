package com.example.demo.dao.write.custom;

import com.example.demo.model.po.Site;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kehui on 2017/11/19.
 */
public interface TestWriteDao {

    @Select("select * from site limit 1")
    Site getSite();
}
