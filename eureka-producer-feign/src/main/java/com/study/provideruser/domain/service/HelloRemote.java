package com.study.provideruser.domain.service;

import com.study.provideruser.domain.hystrixService.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/11/13 10:51.
 */

/** hystrix测试demo provider-user服务失败则调用本地实现类HelloRemoteHystrix对应的降级方法
 * @author CF create on 2018/11/23 13:36
 * @description
 */
@FeignClient(name="provider-user",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello/say")
    String hello(@RequestParam("word")String word);
}
