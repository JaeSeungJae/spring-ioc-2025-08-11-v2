package com.ll.framework.ioc;

import org.reflections.Reflections;

public class ApplicationContext {
    private final String basePackage;
    public ApplicationContext(String basePackage) {
        this.basePackage = basePackage;
    }

    public void init() {
        Reflections reflections = new Reflections(basePackage);
    }

    public <T> T genBean(String beanName) {
        

    }
}
