package com.jsjchai.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ author jsjchai.
 */
@Configuration
public class RuleConfiguration {

    @Bean
    public IRule rule(){
        return new RandomRule();
    }

}
