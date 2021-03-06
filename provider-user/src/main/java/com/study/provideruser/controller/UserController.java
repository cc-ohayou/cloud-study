package com.study.provideruser.controller;

import com.study.provideruser.domain.User;
import com.study.provideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 作用：
 * ① 测试服务实例的相关内容
 * ② 为后来的服务做提供
 * @author eacdy
 */
@RestController
@RequestMapping("/hello")
public class UserController {
  @Autowired
  private DiscoveryClient discoveryClient;
  @Autowired
  private UserRepository userRepository;
  //注意此时启动要么指定 --config.producer.instance=2 要么配置文件配置一下 否则启动失败
  @Value("${config.producer.instance}")
  private int instance;
  /**
   * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
   * @RequestMapping(value = "/id", method = RequestMethod.GET)
   * 类似的注解还有@PostMapping等等
   * @param id
   * @return user信息
   */
  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne =userRepository.findById(id).get();
    return findOne;
  }

  /**
   * 本地服务实例的信息
   *
   */
  @GetMapping("/instance-info")
  public ServiceInstance showInfo() {
    return this.discoveryClient.getInstances("provider-user").get(0);
  }

  @RequestMapping("/say")
  public String hello(String word){
    return  "["+instance+"]"+" welcome to user service "+word+new Date();
  }
}
