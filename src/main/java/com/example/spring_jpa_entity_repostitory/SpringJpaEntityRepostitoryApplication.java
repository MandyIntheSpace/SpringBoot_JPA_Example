package com.example.spring_jpa_entity_repostitory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringJpaEntityRepostitoryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contex = SpringApplication.run(SpringJpaEntityRepostitoryApplication.class, args);
        UserRepository userRepository = contex.getBean(UserRepository.class);

        User user = new User();
        user.setName("f1Soft Internationals");
        user.setCity("Kathmandu");
        user.setStatus("Java Developer");

        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

}
