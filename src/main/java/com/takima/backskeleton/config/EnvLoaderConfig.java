package com.takima.backskeleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class EnvLoaderConfig {

    @Bean
    public PropertySource<?> loadDotEnv() throws IOException {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream(".env")) {
            props.load(fis);
        }

        // injecter chaque clé .env dans les System Properties
        props.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));

        System.out.println("✅ .env file loaded successfully");

        return new PropertiesPropertySource("dotenvProperties", props);
    }
}
