package com.example.model.test.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jianghong on 2016/8/4.
 */
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public Users(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Users(){}
}
