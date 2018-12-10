package com.crazyclub.www.waterlab.service;

import com.crazyclub.www.waterlab.model.mybatis.User;

import java.util.List;

/**
 * 用户信息
 */
public interface UserService {

    User findUserByUserId (int id);

    User findUserByAccount (String account);

    User findUserByNameAndPassword(String userName, String password);

    List<User> listUsers();

    int save(User user);

    int update(User user);

    long countAll();

    List<User> listUsers(int begin, int limit);

    int delete(User user);

    int deleteById(int id);
}
