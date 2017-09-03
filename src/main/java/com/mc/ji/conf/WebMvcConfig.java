package com.mc.ji.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * spring boot的spring-MVC配置类
 * @author mc
 * @date 2017-8-19
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin").setViewName("admin-login");
        registry.addViewController("/admin-home").setViewName("admin-home");
        registry.addViewController("/sys-user").setViewName("sys-user-list");
        registry.addViewController("/new-sys-user").setViewName("new-sys-user");
        super.addViewControllers(registry);
    }
}
