package com.example.web;

import com.example.model.test.domain.Users;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by jianghong on 2016/8/4.
 */
@RestController
@RequestMapping(value="/users")
public class UserController {
    // 创建线程安全的Map
    static Map<Long, Users> userMap = Collections.synchronizedMap(new HashMap<Long, Users>());

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Users> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<Users> r = new ArrayList<Users>(userMap.values());
        return r;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute Users user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        userMap.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Users getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return userMap.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute Users user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        Users u = userMap.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        userMap.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        userMap.remove(id);
        return "success";
    }
}
