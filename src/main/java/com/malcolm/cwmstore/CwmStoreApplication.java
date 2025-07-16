package com.malcolm.cwmstore;

import com.malcolm.cwmstore.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CwmStoreApplication {
    public static void main(String[] args) {
        // ApplicationContext context = SpringApplication.run(CwmStoreApplication.class, args);
        var user = User.builder()
                .id(1L)
                .name("John")
                .password("password")
                .email("john@example.com")
                .build();
    }
}
