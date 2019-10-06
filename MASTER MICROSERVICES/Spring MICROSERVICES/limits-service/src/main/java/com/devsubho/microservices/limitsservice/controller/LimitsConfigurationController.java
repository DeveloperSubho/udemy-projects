package com.devsubho.microservices.limitsservice.controller;

import com.devsubho.microservices.limitsservice.configuration.Configuration;
import com.devsubho.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFroConfiguration() {

        LimitConfiguration l = new LimitConfiguration();
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
