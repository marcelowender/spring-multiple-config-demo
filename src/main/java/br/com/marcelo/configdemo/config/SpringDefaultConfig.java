package br.com.marcelo.configdemo.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class SpringDefaultConfig {

    @Value("${value.spring.valuea}")
    private String valueA;
}
