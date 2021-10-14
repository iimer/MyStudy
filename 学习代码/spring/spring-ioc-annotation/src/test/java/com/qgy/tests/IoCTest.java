package com.qgy.tests;

import com.qgy.beans.User;
import com.qgy.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:28
 */
public class IoCTest {
    ClassPathXmlApplicationContext ioc;
    @Before
    public void before() {
        ioc= new ClassPathXmlApplicationContext("spring-ioc.xml");
    }

    @Test
    public void test1() {
        User user = ioc.getBean(User.class);
        System.out.println(user.getName());
    }

    @Test
    public void test2() {
        UserController userController = ioc.getBean(UserController.class);
        userController.getUser();
    }
}
