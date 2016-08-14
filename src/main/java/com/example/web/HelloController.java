package com.example.web;

import com.example.exception.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianghong on 2016/8/2.
 */
@RestController
public class HelloController {
    @RequestMapping("/indexHello")
    public String indexHello() {
        return "Hello World";
    }
    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public Map<String, String> test() {
        Map<String,String> map=new HashMap<>();
        map.put("host","test");
        return map;
    }
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
