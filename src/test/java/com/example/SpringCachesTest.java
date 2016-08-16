package com.example;

import com.example.model.test.domain.Users;
import com.example.model.test.repository.UsersRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jianghong on 2016/8/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootDemoApplication.class)
public class SpringCachesTest {
    @Autowired
    private UsersRepository userRepository;
    @Before
    public void before() {
        userRepository.save(new Users("AAA", 10));
    }
    @Test
    public void test() throws Exception {
        Users u1 = userRepository.findByName("AAA");
        System.out.println("第一次查询：" + u1.getAge());

        Users u2 = userRepository.findByName("AAA");
        System.out.println("第二次查询：" + u2.getAge());
        userRepository.save(new Users("AAA", 20));
        Users u3=userRepository.findByName("AAA");
        System.out.println("第三次查询："+u3.getAge());
    }

}
