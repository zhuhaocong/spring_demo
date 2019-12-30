package com.zhc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("com.zhc")
@Configuration
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
