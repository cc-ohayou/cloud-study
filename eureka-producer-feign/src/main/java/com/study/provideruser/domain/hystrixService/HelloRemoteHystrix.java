package com.study.provideruser.domain.hystrixService;

import com.study.provideruser.domain.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/11/23 13:34.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam("word") String word) {
        return "hello ,this is Hystrix deal";
    }
}
