package com.crazyclub.www.waterlab.service.impl;

import com.crazyclub.www.waterlab.dao.mybatis.generated.UserMapper;
import com.crazyclub.www.waterlab.model.mybatis.User;
import com.crazyclub.www.waterlab.model.mybatis.UserExample;
import com.crazyclub.www.waterlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User findUserByUserId(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public User findUserByAccount(String account) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserAccountEqualTo(account);
        List<User> users = mapper.selectByExample(userExample);
        if (users.size() > 1) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public User findUserByNameAndPassword(String userName, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(password);
        mapper.selectByExample(example);
        return null;
    }

    @Override
    public List<User> listUsers() {
        return mapper.selectByExample(null);
    }

    @Override
    public int save(User user) {
        return mapper.insert(user);
    }

    @Override
    public int update(User user) {
        return mapper.updateByPrimaryKey(user);
    }

    @Override
    public long countAll() {
        return mapper.countByExample(null);
    }

    @Override
    public List<User> listUsers(int begin, int limit) {
        UserExample example = new UserExample();
        example.setOffset(begin);
        example.setLimit(limit);
        return mapper.selectByExample(example);
    }

    @Override
    public int delete(User user) {
        return deleteById(user.getUserId());
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
