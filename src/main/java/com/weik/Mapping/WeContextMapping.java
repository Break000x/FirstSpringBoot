package com.weik.Mapping;

import com.weik.enitiy.WeContext;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WeContextMapping {
    @Select("select * from wechat_context")
    @Results({
            @Result(property = "context_id",  column = "context_id"),
            @Result(property = "context_name", column = "context_name"),
            @Result(property = "context_hot", column = "context_hot"),
            @Result(property = "context_text_url", column = "context_text_url"),
            @Result(property = "context_create_date", column = "context_create_date"),
            @Result(property = "context_create_time", column = "context_create_time"),
            @Result(property = "context_update_date", column = "context_update_date"),
            @Result(property = "context_update_time", column = "context_update_time"),
            @Result(property = "context_img_url", column = "context_img_url"),
            @Result(property = "context_desc", column = "context_desc")
    })
    List<WeContext> getAllContext();
}
