package com.mc.ji.conf;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
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
        registry.addViewController("/user").setViewName("user-list");
        registry.addViewController("/new-user").setViewName("new-user");
        registry.addViewController("/advert").setViewName("advert-list");
        registry.addViewController("/new-advert").setViewName("new-advert");
        super.addViewControllers(registry);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };

        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
    }

    @Bean
    public Connector httpConnector() {//设置http的80端口自动跳转到https的443端口，还需要在ECS上的安全组-安全规则上添加开放这两个端口
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(80);
        connector.setSecure(false);
        connector.setRedirectPort(443);
        return connector;
    }
}
