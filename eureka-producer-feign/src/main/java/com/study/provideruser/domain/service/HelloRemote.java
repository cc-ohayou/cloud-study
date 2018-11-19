package com.study.provideruser.domain.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/11/13 10:51.
 */
@FeignClient(name="provider-user")
public interface HelloRemote {

    @RequestMapping("/hello/")
    String hello(@RequestParam("word")String word);
}
