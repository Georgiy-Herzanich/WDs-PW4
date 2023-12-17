package com.georgij.pw4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.georgij.pw4.controller",
    "com.georgij.pw4.repository",
    "com.georgij.pw4.service"})
@EnableJpaRepositories(basePackages = "com.georgij.pw4.repository")
public class AppConfig {

}
