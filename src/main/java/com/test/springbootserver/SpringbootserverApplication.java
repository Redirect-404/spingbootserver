package com.test.springbootserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringbootserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootserverApplication.class, args);
    }

}
