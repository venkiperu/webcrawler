package com.sarsun.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages = "com.sarsun.crawler")
public class Application
{
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(final String... args)
    {
        SpringApplication.run(Application.class, args);
    }
}