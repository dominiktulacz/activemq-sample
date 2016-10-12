package com.github.tulacdom.activemqsample.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.github.tulacdom.activemqsample")
@Import(MessagingConfig.class)
public class AppConfig {
}
