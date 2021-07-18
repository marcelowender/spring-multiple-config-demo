package br.com.marcelo.configdemo.service;


import br.com.marcelo.configdemo.config.ConfigA;
import br.com.marcelo.configdemo.config.ConfigB;
import br.com.marcelo.configdemo.config.SpringDefaultConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class ServiceConfig implements CommandLineRunner {

    private final ConfigA configA;
    private final ConfigB configB;
    private final SpringDefaultConfig springDefaultConfig;

    @Override
    public void run(String... args) {
        log.error("Config configA valueA propertie", configA.getValueA());
        log.error("Config configA valueB propertie", configA.getValueB());


        log.error("Config configB valueA propertie", configB.getValueA());
        log.error("Config configB valueB propertie", configB.getValueB());


        log.error("Config springDefaultConfig valuea propertie", springDefaultConfig.getValueA());
    }
}
