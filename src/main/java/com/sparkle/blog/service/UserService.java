package com.sparkle.blog.service;

import com.sparkle.blog.dao.UserDao;
import com.sparkle.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insertUser(User user) {
        userDao.insertUser(user.getId(),user.getUsername(),user.getPassword());
    }
}
