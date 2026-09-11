package com.github.r_sneto.WebServices.config;

import com.github.r_sneto.WebServices.entities.Order;
import com.github.r_sneto.WebServices.entities.User;
import com.github.r_sneto.WebServices.entities.enums.OrderStatus;
import com.github.r_sneto.WebServices.repositories.OrderRepository;
import com.github.r_sneto.WebServices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Roberto Carlos", "roberto@gmail.com", "984523699", "roberto123");
        User u2 = new User(null, "Alfredo Edo", "alfredo@gmail.com", "945239799", "eitanos123");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);

        userRepository.saveAll(Arrays.asList(u1 ,u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
