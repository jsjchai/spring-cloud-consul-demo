package com.jsjchai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jsjchai.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulDemoProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsulDemoProviderApplication.class, args);
    }
}
