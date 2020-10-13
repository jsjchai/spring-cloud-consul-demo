package com.github.jsjchai.service;


import com.github.jsjchai.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jsjchai.
 */
@FeignClient(name = "consul-demo-provider")
public interface  UserCilentService {

    @GetMapping("/user/findAll")
    List<User> findAll();
}
