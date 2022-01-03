package com.manage.config;

import com.manage.interceptor.LogInterceptor;
import com.manage.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author suYan
 * @Date 2022/1/3 2:46
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public LogInterceptor setBean(){
        return new LogInterceptor(); // 注入spring
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/manager/**")
                .excludePathPatterns("/static/**","/","/manager/login");
        registry.addInterceptor(setBean()).addPathPatterns("/manager/**")
                .excludePathPatterns("/static/**","/","/manager/login");
    }
}
