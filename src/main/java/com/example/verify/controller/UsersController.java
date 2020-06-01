package com.example.verify.controller;

import com.example.verify.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UsersController {


    @RequestMapping("/addUser")
    public  String showPage(Exception exception){
        String len=null;
        System.out.println(len.length());
        return "add";
    }
    @RequestMapping("/save")
    public String saveUser(@Valid Users users , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add";
        }

        return "ok";
    }
    @RequestMapping("/save12")
    public String saveUser1( ){
        int a=10/0;
        System.out.println(a);

        return "ok";
    }

    /**
     *
     * java.lang.ArithmeticException
     * 方法需要返回modelandView
     */


}
