package com.qgy.tests;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import qgy.IoCJavaConfig;
import qgy.beans.Role;
import qgy.beans.User;
import qgy.controller.UserController;

/**
 * @author qgyiimer
 * @create 2021-{05}--19:50
 */
public class JavaConfigTest {
    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(IoCJavaConfig.class);

    @Before
    public void before() {
        ioc = new AnnotationConfigApplicationContext(IoCJavaConfig.class);

    }
    @Test
    public void test() {
        //加载spring上下文
        UserController bean = ioc.getBean(UserController.class);
    }

    @Test
    public void test1() {
        DruidDataSource druidDataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(druidDataSource);
    }

    @Test
    public void test2() {
//        User user2 = ioc.getBean("user5", User.class);
//        System.out.println(user2);
//
//        Role role = ioc.getBean("role", Role.class);
//        System.out.println(role.getName());
//        User user = ioc.getBean(User.class);
//        System.out.println(user);
        Role role = ioc.getBean("role",Role.class);
        System.out.println(role);
    }
}
