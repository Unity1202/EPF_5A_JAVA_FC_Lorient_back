package com.takima.backskeleton;

import com.takima.backskeleton.config.EnvInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackSkeletonApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BackSkeletonApplication.class);
        app.addInitializers(new EnvInitializer());
        app.run(args);
    }
}
