package com.study.autuator.web;

import com.study.autuator.core.config.ConfigBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/8/3 11:22.
 */
@RestController
@RequestMapping("/hello")
public class MiYaController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;
    @Resource
    ConfigBean config;

    @GetMapping("/getName")
    public String getName() {
        return  name+":"+age;
    }
    @RequestMapping("/getConfig")
    public String getConfig() {
        return config.toString();
    }
}
