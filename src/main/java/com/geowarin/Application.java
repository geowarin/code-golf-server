package com.geowarin;

import com.geowarin.redirect.RedirectResource;
import com.geowarin.rest.JerseyConfig;
import com.geowarin.task.TaskResource;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * Date: 22/12/13
 * Time: 18:03
 *
 * @author Geoffroy Warin (http://com.geowarin.github.io)
 */
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {RedirectResource.class, TaskResource.class})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplicationBuilder application = new SpringApplicationBuilder(Application.class).showBanner(false);

        if (!new SimpleCommandLinePropertySource(args).containsProperty("spring.profiles.active")) {
            application.profiles("dev");
        }
        application.run(args);
    }

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }
}
