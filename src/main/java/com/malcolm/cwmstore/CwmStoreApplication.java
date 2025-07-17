package com.malcolm.cwmstore;
import com.malcolm.cwmstore.entities.Address;
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

        Address address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }
}