package com.qgy.dao.impl;

import com.qgy.dao.IUserDao;
import com.qgy.entity.User;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author qgyiimer
 * @create 2021-{05}--22:24
 */

@Repository("iUserDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public User select(Integer id) throws Exception {
        if (id==null) {
            throw new Exception("Id不能为null");
        }
        return new User();
    }

    @Override
    public void add(User user) throws Exception {
        if (user==null) {
            throw new Exception("user不能为null");
        }
    }

    @Override
    public void update(User user) throws Exception {
        if (user==null) {
            throw new Exception("user不能为null");
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        if (id==null) {
            throw new Exception("Id不能为null");
        }
    }
}
