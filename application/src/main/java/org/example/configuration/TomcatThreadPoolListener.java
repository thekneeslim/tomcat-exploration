package org.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TomcatThreadPoolListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(String.format("[TOMCAT CONFIG] Min Spare Threads: %d", serverProperties.getTomcat().getMinSpareThreads()));
        System.out.println(String.format("[TOMCAT CONFIG] Max Connections: %d", serverProperties.getTomcat().getMaxConnections()));
        System.out.println(String.format("[TOMCAT CONFIG] Max Threads: %d", serverProperties.getTomcat().getMaxThreads()));
        System.out.println(String.format("[TOMCAT CONFIG] Accept Count: %d", serverProperties.getTomcat().getAcceptCount()));
    }
}

