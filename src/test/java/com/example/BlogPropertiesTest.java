package com.example;

import com.example.model.test.TestEntriy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jianghong on 2016/8/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringBootDemoApplication.class)
public class BlogPropertiesTest {
    @Autowired
    private TestEntriy testEntriy;


    @Test
    public void getHello() throws Exception {
        System.out.println(testEntriy.getValue());
        System.out.println(testEntriy.getNumber());
        System.out.println(testEntriy.getBigNumber());
        System.out.println(testEntriy.getTest1());
        System.out.println(testEntriy.getTest2());
        Assert.assertEquals(testEntriy.getName(), "菜鸟程序猿");
        Assert.assertEquals(testEntriy.getTitle(), "学习spring boot");
        Assert.assertEquals(testEntriy.getDesc(), "菜鸟程序猿正在努力学习spring boot");
    }
}
