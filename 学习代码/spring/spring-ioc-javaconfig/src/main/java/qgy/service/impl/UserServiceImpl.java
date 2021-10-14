package qgy.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import qgy.service.UserService;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:26
 */

//@Service("userService")
@Service
@Primary
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        System.out.println("查询数据库");
    }
}
