package com.jsjchai.service.impl;


import com.jsjchai.service.WeatherService;
import org.springframework.stereotype.Service;

/**
 * @author jsjchai.
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public String getWeatherConditions() {
        return "sunny";
    }
}
