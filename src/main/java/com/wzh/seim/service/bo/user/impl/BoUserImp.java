package com.wzh.seim.service.bo.user.impl;

import com.wzh.seim.service.bo.user.IBoUser;
import com.wzh.seim.service.dao.user.impl.UserDaoImpl;
import com.wzh.seim.service.entity.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class BoUserImp implements IBoUser {
    @Resource
    private UserDaoImpl userDao;

    public List<User> getUserList(Map map){
        List<User> list= userDao.getUserList(map);
        return list;
    }

}
