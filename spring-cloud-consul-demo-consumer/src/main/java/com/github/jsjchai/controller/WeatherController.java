package com.github.jsjchai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jsjchai.
 */
@RestController
public class WeatherController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getWeatherConditions")
    public String getWeatherConditions() {
        return restTemplate.getForObject("http://consul-demo-provider/getWeatherConditions", String.class);
    }

}
