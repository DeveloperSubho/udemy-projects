package com.devsubho.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SUBHAJIT on 09-07-2019.
 */

@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }
}
