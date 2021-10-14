package com.iimer.test;

import com.iimer.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qgyiimer
 * @create 2021-{08}--8:49
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        final Object car = context.getBean("car");
        System.out.println(car);
        final Object plane = context.getBean("plane");
        System.out.println(plane);
        final Object aCar = context.getBean("aCar");
        System.out.println(aCar);
    }
}
