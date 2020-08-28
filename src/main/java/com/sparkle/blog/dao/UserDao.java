package com.sparkle.blog.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    @Insert("INSERT INTO user(id, username, password) values(#{id}, #{username}, #{password})")
    void insertUser(@Param("id") String id, @Param("username") String username, @Param("password") String password);
}
