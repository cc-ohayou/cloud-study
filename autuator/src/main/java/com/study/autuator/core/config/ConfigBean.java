package com.study.autuator.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/8/3 11:45.
 */
@ConfigurationProperties(prefix = "my")
@Component
@Data
@Primary
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max ;
    private String value ;
    private String greeting ;

    @Override
    public String toString() {
        return "ConfigBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", uuid='" + uuid + '\'' +
                ", max=" + max +
                ", value='" + value + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
