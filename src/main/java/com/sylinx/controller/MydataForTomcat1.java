package com.sylinx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("springboot1")
public class MydataForTomcat1 implements Mydata{
    public String profile = "tomcat1";

    @Value("${message.value}")
    public String message;

    @Override
    public String getValue() {
        return message;
    }
}
