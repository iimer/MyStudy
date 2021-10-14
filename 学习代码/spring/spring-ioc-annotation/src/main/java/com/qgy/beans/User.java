package com.qgy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:32
 */
@Component
public class User {

    /*
    使用@Value设置依赖注入的属性
    1.硬编码值
    2.${} 、 #{} spring2.5还是需要在xml中引入资源文件
    */

//    @Value("${mysql.username}")
    @Value("#{role.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
