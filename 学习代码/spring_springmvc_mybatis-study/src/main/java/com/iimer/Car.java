package com.iimer;

import org.springframework.stereotype.Component;

/**
 * @author qgyiimer
 * @create 2021-{08}--8:49
 */
@Component
public class Car {
    String name;
    public Car() {
        this.name = "红色法拉利";
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
