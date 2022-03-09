package com.hospitalsystem.Hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableOAuth2Sso
public class HsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsApplication.class, args);
    }

}
