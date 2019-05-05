package com.wzh.seim.service.dao.user.impl;

import com.wzh.seim.service.dao.user.IUserDao;
import com.wzh.seim.service.entity.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserDaoImpl implements IUserDao {
    private User user;

    @Override
    public List<User> getUserList(Map map) {
        List<User> list=new ArrayList();
        user=new User();
        user.setUserid("1");
        user.setUsername("1name");
        user.setPassword("1password");
        list.add(user);
        return list;
    }
}
