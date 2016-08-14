package com.example.model.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jianghong on 2016/8/2.
 */
@Component
public class TestEntriy {
    @Value("${com.name}")
    private String name;
    @Value("${com.title}")
    private String title;
    @Value("${com.desc}")
    private String desc;
    /**
     * 随机字符串
     */
    @Value("${com.value}")
    private String value;
    /**
     * 随机int
     */
    @Value("${com.number}")
    private int number;
    /**
     * 随机long
     */
    @Value("${com.bignumber}")
    private Long bigNumber;
    /**
     * 10以内的随机数
     */
    @Value("${com.test1}")
    private int test1;
    /**
     * 10-20之间的随机数
     */
    @Value("${com.test2}")
    private int test2;

    public void setValue(String value) {
        this.value = value;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBigNumber(Long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    public Long getBigNumber() {
        return bigNumber;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
