package com.offcn.service.impl;

import com.offcn.pojo.User;
import com.offcn.pojo.UserDao;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);


    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {

       userDao.updateUser(user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> allUser = userDao.findAllUser();
        return allUser;
    }

    @Override
    public User findOne(Integer id) {
        User one = userDao.findOne(id);
        return one;
    }
}
