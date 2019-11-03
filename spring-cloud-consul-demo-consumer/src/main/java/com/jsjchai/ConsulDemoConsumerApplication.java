package com.jsjchai;

import com.jsjchai.mq.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author jsjchai.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableBinding({ MySink.class })
public class ConsulDemoConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsulDemoConsumerApplication.class, args);
    }
}
