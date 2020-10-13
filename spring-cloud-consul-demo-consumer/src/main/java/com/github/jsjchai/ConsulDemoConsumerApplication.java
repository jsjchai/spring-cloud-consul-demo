package com.github.jsjchai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jsjchai.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsulDemoConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsulDemoConsumerApplication.class, args);
    }
}
