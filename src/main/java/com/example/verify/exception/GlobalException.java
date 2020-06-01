package com.example.verify.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception exp){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("error",exp.toString());
        modelAndView.setViewName("error1");
        return modelAndView;
    }
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView arithmeticExceptionHandler1(Exception exp){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("error",exp.toString());
        modelAndView.setViewName("error3");
        return modelAndView;
    }
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView arithmeticExceptionHandler2(Exception exp){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("error",exp.toString());
        modelAndView.setViewName("error2");
        return modelAndView;
    }
}
