package com.qgy.mybatisplus.mapper;

import com.qgy.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author qgyiimer
 * @create 2021-{06}--11:06
 */

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User user = new User();
        user.setName("小明");
        user.setPwd("123456");
        int insert = mapper.insert(user);

    }
}