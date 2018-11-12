package com.study.eurekaconsumer.domain.common.enums;

/**
 * @AUTHOR CF
 * @DATE Created on 2018/10/26 15:22.
 */
public enum ServiceEnum {
    USER("provider-user","用户服务");
    private String serviceName;
    private String label;

    ServiceEnum(String serviceName, String label) {
        this.serviceName = serviceName;
        this.label = label;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
