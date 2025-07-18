package com.malcolm.cwmstore;

import com.malcolm.cwmstore.entities.User;
import com.malcolm.cwmstore.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CwmStoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CwmStoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);

        var user = User.builder()
                .name("John")
                .email("john@gmail.com")
                .password("password")
                .build();

        repository.save(user);
    }
}