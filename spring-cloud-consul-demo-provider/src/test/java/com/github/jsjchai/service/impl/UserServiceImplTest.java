package com.github.jsjchai.service.impl;

import com.github.jsjchai.ConsulDemoProviderApplication;
import com.github.jsjchai.model.User;
import com.github.jsjchai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @author jsjchai.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsulDemoProviderApplication.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void findAll() {
        List<User> users = userService.findAll();
        assertNotNull(users);
    }
}
