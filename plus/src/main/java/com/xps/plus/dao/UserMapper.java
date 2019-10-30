package com.xps.plus.dao;

import com.xps.plus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User login(@Param("userName")String userName,
                      @Param("password")String password);
}
