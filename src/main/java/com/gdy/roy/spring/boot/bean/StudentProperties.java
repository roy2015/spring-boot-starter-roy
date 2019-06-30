package com.gdy.roy.spring.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by apple on 2019/6/30.
 */

@ConfigurationProperties(prefix = "spring.gdy.roy")
public class StudentProperties {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
