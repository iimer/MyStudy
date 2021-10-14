package com.qgy.controller;

import com.qgy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:25
 */
@Controller
public class UserController {

    /*
    使用@Autowired来实现自动注入
    bytype byname
    默认优先根据类型去匹配，子类也算，如果存在泛型，则属于不同类型，也需要用有泛型的变量接收
    匹配到多个类型则会按照名字匹配(这里userServiceImpl不同)
    没有合适的名字就报错
            1.可以去修改属性的名字对应bean的名字
            2.修改注解的默认值
            3.通过增加@Qualifier来设置属性的名字（覆盖，设置了这个，优先级大于原本名字）
            4.通过@Primary设置主要Bean


    如果autowired写在方法（构造器亦可）上面，就是对应参数值
    qualifier可以写在参数前面

    autowired优先根据类型匹配，依赖于spring
    resource优先根据名字匹配，依赖于jdk
     */

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    public void getUser() {
        userService.getUser();
    }
}
