package com.qgy.dao;

import com.qgy.entity.User;

/**
 * @author qgyiimer
 * @create 2021-{05}--22:24
 */
public interface IUserDao {
    User select(Integer id) throws Exception;
    void add(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(Integer id) throws Exception;
}
