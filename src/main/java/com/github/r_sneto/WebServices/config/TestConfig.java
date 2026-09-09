package com.github.r_sneto.WebServices.config;

import com.github.r_sneto.WebServices.entities.User;
import com.github.r_sneto.WebServices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Roberto Carlos", "roberto@gmail.com", "984523699", "roberto123");
        User u2 = new User(null, "Alfredo Edo", "alfredo@gmail.com", "945239799", "eitanos123");

        userRepository.saveAll(Arrays.asList(u1 ,u2));
    }
}
