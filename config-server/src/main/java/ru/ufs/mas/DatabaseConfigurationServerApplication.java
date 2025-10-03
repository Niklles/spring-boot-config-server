package ru.ufs.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DatabaseConfigurationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseConfigurationServerApplication.class, args);
    }

}
