package com.github.jsjchai.service.impl;


import com.github.jsjchai.service.WeatherService;
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
