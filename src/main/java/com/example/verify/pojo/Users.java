package com.example.verify.pojo;

import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class Users {
    @NotBlank(message = "用户名不能为空")
    @Length(min = 2,max = 6,message = "最小长度为为两位，最大长度为六位")
    private  String name;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotNull(message = "年龄不能为空 ")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
