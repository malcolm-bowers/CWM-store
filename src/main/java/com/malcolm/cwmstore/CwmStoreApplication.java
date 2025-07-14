package com.malcolm.cwmstore;

import com.malcolm.cwmstore.managers.NotificationManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CwmStoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CwmStoreApplication.class, args);
        var manager = context.getBean(NotificationManager.class);
        manager.sendNotification("This is a test");
    }
}
