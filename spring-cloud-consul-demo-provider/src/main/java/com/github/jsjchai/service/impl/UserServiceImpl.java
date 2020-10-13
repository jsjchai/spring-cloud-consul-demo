package com.github.jsjchai.service.impl;



import com.github.jsjchai.dao.UserDao;
import com.github.jsjchai.service.UserService;
import com.github.jsjchai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jsjchai
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
