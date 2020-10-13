package com.github.jsjchai.service;



import com.github.jsjchai.model.User;

import java.util.List;


/**
 * @author jsjchai
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
