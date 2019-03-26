package com.jsjchai.controller;

import com.jsjchai.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jsjchai.
 */
@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     * 获取当天天气状况
     * @return  天气状况
     */
    public String getWeatherConditions(){
        return weatherService.getWeatherConditions();
    }
}
