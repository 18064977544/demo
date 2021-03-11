package com.offcn.pojo;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into user(userName,age)values(#{userName},#{age})")
    public void addUser(User user);
    @Delete("delete from user where id=#{id}")
    public void deleteUser(Integer id);
    @Update("update user set userName=#{userName},age=#{age} where id=#{id}")
    public void updateUser(User user);
    @Select("select*from user")
    public List<User> findAllUser();
    @Select("select*from user where id=#{id}")
    public User findOne(Integer id);
}
