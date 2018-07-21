package com.weik.Mapping;

import com.weik.enitiy.WeMenu;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WeMenuMapping {
    //查询语句
    @Select("select * from wechat_menu")
    @Results({
            @Result(property = "menu_id",  column = "menu_id"),
            @Result(property = "menu_name", column = "menu_name"),
            @Result(property = "menu_position", column = "menu_position"),
            @Result(property = "menu_img", column = "menu_img"),
            @Result(property = "menu_create_date", column = "menu_create_date"),
            @Result(property = "menu_create_time", column = "menu_create_time"),
            @Result(property = "menu_update_date", column = "menu_update_date"),
            @Result(property = "menu_update_time", column = "menu_update_time")
    })
    List<WeMenu> getAllClass();
}
