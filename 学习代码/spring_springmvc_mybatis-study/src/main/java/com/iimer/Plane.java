package com.iimer;

import org.springframework.stereotype.Component;

/**
 * @author qgyiimer
 * @create 2021-{08}--8:51
 */

public class Plane {
    String name;
    String describe;
    public Plane() {
        this.describe = "我是一个飞机！";
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
