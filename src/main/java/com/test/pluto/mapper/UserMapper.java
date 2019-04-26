package com.test.pluto.mapper;

import com.test.pluto.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    @Select("select * from message where id = #{id}")
    public User getUserUsingId(@Param("id") int id);
}