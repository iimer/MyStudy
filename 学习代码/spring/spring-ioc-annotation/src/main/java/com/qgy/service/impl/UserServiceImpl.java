package com.qgy.service.impl;

import com.qgy.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:26
 */

@Service("userService")
@Primary
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        System.out.println("查询数据库");
    }
}
