package com.github.jsjchai.dao;



import com.github.jsjchai.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author jsjchai
 */
@Mapper
public interface UserDao {

    List<User> findAll();
}
