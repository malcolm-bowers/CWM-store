package com.malcolm.cwmstore;

import com.malcolm.cwmstore.entities.Profile;
import com.malcolm.cwmstore.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CwmStoreApplication {
    public static void main(String[] args) {
        // ApplicationContext context = SpringApplication.run(CwmStoreApplication.class, args);
        User user = User.builder()
                .name("John")
                .password("password")
                .email("john@email.com")
                .build();

        var profile = Profile.builder()
                        .bio("bio")
                        .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}