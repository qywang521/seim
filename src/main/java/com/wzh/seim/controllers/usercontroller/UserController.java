package com.wzh.seim.controllers.usercontroller;

import com.wzh.seim.service.bo.user.IBoToperator;
import com.wzh.seim.service.bo.user.impl.BoUserImp;
import com.wzh.seim.service.entity.user.User;
import com.wzh.seim.service.entity.user.TOperator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.wzh.seim.util.UtilTools.listToString;


@Controller
public class UserController {
    @Resource
    BoUserImp boUserImp;

    @Resource
    IBoToperator iBoToperator;


    @GetMapping("/user/list")
    public String userList(Map<String,Object> map){
        map.put("hello","user list welcom");
        return "/user/userlist";
    }

    @GetMapping("/user/list2")
    public String userList2(Map<String,Object> map){
        List<User> userList = boUserImp.getUserList(map);
        map.put("helloobject",userList);
        map.put("hellostring",listToString(userList));
        return "/user/userlist";
    }

    @GetMapping("/user/list3")
    public String userList3(Map<String,Object> map){
        try {
            Long l= 44550L;
            TOperator operator = iBoToperator.selectByPrimaryKey(l);
            map.put("operator",operator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/user/userlist";
    }

}
