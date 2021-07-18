package br.com.marcelo.configdemo.controller;

import br.com.marcelo.configdemo.service.ServiceConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ConfigValuesController {

    private final ServiceConfig serviceConfig;


    @GetMapping("/values")
    public ResponseEntity<List<String>> getConfigValuesFromProperties() {
        return ResponseEntity.ok(serviceConfig.getConfigValues());
    }

}
