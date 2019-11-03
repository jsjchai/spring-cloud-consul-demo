package com.jsjchai.controller;


import com.jsjchai.model.User;
import com.jsjchai.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ author jsjchai.
 */
@RestController
@Slf4j
@Api("用户信息")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/findAll")
    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    public List<User> findAll(){
        log.info("findAll start");
        return userService.findAll();
    }

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello Consul Discovery " + string;
    }

}
