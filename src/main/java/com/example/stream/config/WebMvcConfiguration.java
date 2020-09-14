package com.example.stream.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        ThreadPoolTaskExecutor asyncTaskExecutor = new ThreadPoolTaskExecutor();
        asyncTaskExecutor.setCorePoolSize(4);
        asyncTaskExecutor.setMaxPoolSize(10);
        asyncTaskExecutor.setQueueCapacity(40);
        asyncTaskExecutor.initialize();
        configurer.setTaskExecutor(asyncTaskExecutor);
    }
}


