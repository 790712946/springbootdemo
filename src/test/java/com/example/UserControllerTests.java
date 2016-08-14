package com.example;

import com.example.model.test.domain.Users;
import com.example.model.test.repository.UsersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jianghong on 2016/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootDemoApplication.class)
public class UserControllerTests {
    @Autowired
    private UsersRepository userRepository;

    @Test
    public void testUserController() throws Exception {
        // 创建10条记录
        userRepository.save(new Users("AAA", 10));
        userRepository.save(new Users("BBB", 20));
        userRepository.save(new Users("CCC", 30));
        userRepository.save(new Users("DDD", 40));
        userRepository.save(new Users("EEE", 50));
        userRepository.save(new Users("FFF", 60));
        userRepository.save(new Users("GGG", 70));
        userRepository.save(new Users("HHH", 80));
        userRepository.save(new Users("III", 90));
        userRepository.save(new Users("JJJ", 100));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());

        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());

        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepository.findAll().size());

    }
}
