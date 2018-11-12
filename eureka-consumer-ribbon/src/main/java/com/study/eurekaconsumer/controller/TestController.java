package com.study.eurekaconsumer.controller;

import com.study.eurekaconsumer.domain.common.enums.ReqUrlEnums;
import com.study.eurekaconsumer.domain.common.enums.ServiceEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/10/26 15:18.
 */
@RestController
@RequestMapping("/ribbon/test")
public class TestController {

    @Resource
    RestTemplate restTemplate;
    @RequestMapping("/say")
    public String hello(@RequestParam String word){
        word+="!";
        String requestUrl="http://"+ServiceEnum.USER.getServiceName()
                + ReqUrlEnums.HELLO_TEST.getUrl();
        return restTemplate.getForObject(requestUrl,String.class,word);
    }

}
