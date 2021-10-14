package com.qgy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:56
 */
@Component
//@DependsOn("user")
//@Lazy
//@Scope("prototype")

public class Role {

    @Value("胡歌")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //生命周期回调方式三 初始化回调
    @PostConstruct
    public void init() {

    }

    //生命周期回调方式三 销毁回调
    @PreDestroy
    public void destroy() {

    }
}
