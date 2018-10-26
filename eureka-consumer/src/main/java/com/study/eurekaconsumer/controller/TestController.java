package com.study.eurekaconsumer.controller;

import com.study.eurekaconsumer.domain.common.enums.ReqUrlEnums;
import com.study.eurekaconsumer.domain.common.enums.ServiceEnum;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
@RequestMapping("/test")
public class TestController {

    @Resource
    private LoadBalancerClient client;

    @Resource
    RestTemplate restTemplate;
    @RequestMapping("/")
    public String hello(@RequestParam String word){
        word+="!";
        ServiceInstance instance=client.choose(ServiceEnum.USER.getServiceName());
        String requestUrl="http://"+instance.getHost()+":"+instance.getPort()
                + ReqUrlEnums.HELLO_TEST.getUrl();
        return restTemplate.getForObject(requestUrl,String.class,word);
    }

}
