package br.com.marcelo.configdemo.service;


import br.com.marcelo.configdemo.config.ConfigA;
import br.com.marcelo.configdemo.config.ConfigB;
import br.com.marcelo.configdemo.config.SpringDefaultConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class ServiceConfig {

    private final ConfigA configA;
    private final ConfigB configB;
    private final SpringDefaultConfig springDefaultConfig;

    public List<String> getConfigValues() {
        List<String> configValues = new ArrayList<>();
        configValues.add("Config configA valueA propertie: " + configA.getValueA());
        configValues.add("Config configA valueB propertie:" + configA.getValueB());


        configValues.add("Config configB valueA propertie:" + configB.getValueA());
        configValues.add("Config configB valueB propertie:" + configB.getValueB());
        configValues.add("Github Value" + configB.getGithubValue());

        configValues.add("Config springDefaultConfig valuea propertie:" + springDefaultConfig.getValueA());

        return configValues;
    }
}
