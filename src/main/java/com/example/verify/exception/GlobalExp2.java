package com.example.verify.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class GlobalExp2 {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){

        Properties mapping =new Properties();
        mapping.put("java.lang.ArithmeticException","error1");
        mapping.put("java.lang.NullPointerException","error2");
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        resolver.setExceptionMappings(mapping);
        return resolver;
    }


}


