package com.study.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * RefreshScope 注解用于保证客户端执行/actuator/refresh时更新此处的属性配置

 * @AUTHOR CF
 * @DATE Created on 2018/12/6 15:55.
 */
@RestController
@RefreshScope
public class ConfigController {
    //对应远程仓库的 配置文件中的profile属性值 获取不到时默认值error
    @Value("${profile:error}")
    private String profile;

    @RequestMapping("/info")
    public Mono<String> hello(){
        return Mono.justOrEmpty(profile);
    }
}
