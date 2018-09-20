package com.matteo.pipitone.profiles.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")

public class DBConfiguration {

    @Profile("dev")
    @Bean
    public String devProfile(){
        System.out.println("Wow, You are in Dev profile!");
        return "Profile Dev";
    }

    @Profile("test")
    @Bean
    public String testProfile(){
        System.out.println("Wow, You are in Test profile");
        return "Profile Test";
    }

    @Profile("prod")
    @Bean
    public String prodProfile(){
        System.out.println("Wow, ou are in Production Profile");
        return "Profile production";
    }
}
