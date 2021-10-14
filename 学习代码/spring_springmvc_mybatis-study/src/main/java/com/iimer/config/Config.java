package com.iimer.config;

import com.iimer.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qgyiimer
 * @create 2021-{08}--8:50
 */
@Configuration
@ComponentScan("com.iimer")
public class Config {
    @Bean
    public Plane plane(){
        return new Plane();
    }

}
