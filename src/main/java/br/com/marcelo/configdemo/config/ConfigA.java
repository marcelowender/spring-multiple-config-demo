package br.com.marcelo.configdemo.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:applicationconfiga.properties")
@ConfigurationProperties(prefix = "configa")
@Getter
@Setter
public class ConfigA {
    private String valueA;
    private String valueB;
}
