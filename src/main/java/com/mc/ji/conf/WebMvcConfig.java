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
        registry.addViewController("/role").setViewName("role-list");
        registry.addViewController("/new-role").setViewName("new-role");
        registry.addViewController("/file").setViewName("file-list");
        registry.addViewController("/new-file").setViewName("new-file");
        registry.addViewController("/folder").setViewName("folder-list");
        registry.addViewController("/new-folder").setViewName("new-folder");
        registry.addViewController("/acc-type").setViewName("acc-type-list");
        registry.addViewController("/new-acc-type").setViewName("new-acc-type");
        registry.addViewController("/account").setViewName("account-list");
        registry.addViewController("/new-account").setViewName("new-account");
        super.addViewControllers(registry);
    }
}
