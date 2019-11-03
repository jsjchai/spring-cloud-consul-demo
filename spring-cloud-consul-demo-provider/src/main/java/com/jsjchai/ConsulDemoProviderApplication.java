package com.jsjchai;

import com.jsjchai.service.StreamClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author jsjchai.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({ StreamClient.class })
public class ConsulDemoProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsulDemoProviderApplication.class, args);
    }
}
