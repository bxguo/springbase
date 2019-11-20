package com.mvc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author: bxguo
 * @time: 2019/11/20 14:17
 */
@Configuration
@ComponentScan("com.mvc.controller")
public class AppConfig {
    @Bean
    public InternalResourceViewResolver iternalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
