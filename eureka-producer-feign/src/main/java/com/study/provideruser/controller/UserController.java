package com.study.provideruser.controller;

import com.study.provideruser.domain.service.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 作用：
 * ① 测试服务实例的相关内容
 * ② 为后来的服务做提供
 * @author eacdy
 */
@RestController
@RequestMapping("/hello")
public class UserController {

  @Resource
  HelloRemote helloRemote;

  @RequestMapping("/{name}")
  public String hello(@PathVariable("name")String name){
    return  helloRemote.hello(name+"!");
  }
}
