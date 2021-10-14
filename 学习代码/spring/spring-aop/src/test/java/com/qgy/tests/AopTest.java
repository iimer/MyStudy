package com.qgy.tests;

import com.qgy.entity.User;
import com.qgy.service.IUserService;
import com.qgy.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qgyiimer
 * @create 2021-{05}--10:38
 */
public class AopTest {
    ClassPathXmlApplicationContext aop;
    @Before
    public void before() {
        aop = new ClassPathXmlApplicationContext("" +
                "spring-aop.xml");
    }

    /**
     * 被代理的类有接口时，存进去的是对应的Proxy对象
     * 此Proxy是jdk中的动态代理实现，实现被代理类的接口
     * 通过类型找不到，但是通过名称可以找到
     */
    @Test
    public void test1() {
        IUserService userService = aop.getBean("userServiceImpl", IUserService.class);
        System.out.println(userService.getClass());
        //class com.sun.proxy.$Proxy21   需要接口
    }

    /**
     * 去除接口后接收
     * class com.qgy.service.impl.UserServiceImpl$$EnhancerBySpringCGLIB$$12f0738
     * cglib所产生的一个代理类，被代理的类没有实现接口
     */
    @Test
    public void test2() {
        UserServiceImpl userService = aop.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService.getClass());
    }

    /**
     *
     * 切点参数
     *
     */
    @Test
    public void test3() throws Exception {
        IUserService userService = aop.getBean("userServiceImpl", IUserService.class);
        userService.add(new User());
        userService.delete(1);
        userService.update(null);
        userService.select(1);

    }
}
