package com.webshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= {"com.webshop"},
    excludeFilters= {
        @Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
    })
public class MainSpringContextConfig {

  @Bean
  public String getMyBean(){
    System.out.println("testing");
    return "hello";
  }

}
