package com.qgy.service.impl;

import com.qgy.dao.IUserDao;
import com.qgy.dao.impl.UserDaoImpl;
import com.qgy.entity.User;
import com.qgy.service.IUserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qgyiimer
 * @create 2021-{05}--22:24
 */
@Service
public class UserServiceImpl  implements IUserService{

    @Autowired
    IUserDao iUserDao;

    @Logger(name = "select的logger注解执行到了")
    @Override
    public User select(Integer id) throws Exception {
        System.out.println("查询User");
//        return userDaoImpl.select(id);
        return iUserDao.select(id);
    }

    @Override
    @Logger(name = "add的logger注解执行到了")
    public void add(User user) throws Exception {
        System.out.println("增加User");
        iUserDao.add(user);
    }

    @Override
    @Logger(name = "update的logger注解执行到了")
    public void update(User user) throws Exception {
        System.out.println("修改ser");
        iUserDao.update(user);
    }

    @Override
    @Logger(name = "delete的logger注解执行到了")
    public void delete(Integer id) throws Exception {
        System.out.println("删除User");
        iUserDao.delete(id);
    }
}
