package com.iimer.config;

import com.iimer.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qgyiimer
 * @create 2021-{08}--14:46
 */
@Configuration
public class Config2 {
    @Bean
    public Car aCar(){
        final Car car = new Car();
        return car;
    }
}
