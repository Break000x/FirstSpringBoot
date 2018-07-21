package com.weik.Mapping;

import com.weik.enitiy.WeHome;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WeHomeMapping {
    //查询语句
    @Select("select * from wechat_home")
    @Results({
            @Result(property = "home_id",  column = "home_id"),
            @Result(property = "home_position", column = "home_position"),
            @Result(property = "home_img", column = "home_img"),
            @Result(property = "home_img_url", column = "home_img_url"),
            @Result(property = "home_create_date", column = "home_create_date"),
            @Result(property = "home_create_time", column = "home_create_time"),
            @Result(property = "home_update_date", column = "home_update_date"),
            @Result(property = "home_update_time", column = "home_update_time")
    })
    List<WeHome> getAll();
}
