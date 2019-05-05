package com.wzh.seim.controllers.indexcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller

public class IndexController {

    @GetMapping("/index")
    public String index(Map<String,Object> map) {
        map.put("hello","from thymeleaf");
        return "index";
    }
}
