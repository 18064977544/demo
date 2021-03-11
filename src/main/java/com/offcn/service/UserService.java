package com.offcn.service;

import com.offcn.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void deleteUser(Integer id);

    public void updateUser(User user);

    public List<User> findAllUser();

    public User findOne(Integer id);
}
