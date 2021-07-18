package br.com.marcelo.configdemo.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:applicationconfigb.properties")
@ConfigurationProperties(prefix = "configb")
@Getter
@Setter
public class ConfigB {
    private String valueA;
    private String valueB;
}
