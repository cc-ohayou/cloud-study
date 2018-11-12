package com.study.eurekaconsumer.domain.common.enums;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/10/26 15:29.
 */
public enum ReqUrlEnums {
    HELLO_TEST("/hello?word=","测试用url", ServiceEnum.USER.getServiceName());
    private String url;
    private String label;
    private String serviceBelong;

    ReqUrlEnums(String url, String label, String serviceBelong) {
        this.url = url;
        this.label = label;
        this.serviceBelong = serviceBelong;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getServiceBelong() {
        return serviceBelong;
    }

    public void setServiceBelong(String serviceBelong) {
        this.serviceBelong = serviceBelong;
    }
}
