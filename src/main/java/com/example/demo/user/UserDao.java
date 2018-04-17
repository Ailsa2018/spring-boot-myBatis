package com.example.demo.user;

import com.example.demo.Useraaa;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from tbl_user where id = #{id}")
    Useraaa getUserById(@Param("id")Long id);
}
