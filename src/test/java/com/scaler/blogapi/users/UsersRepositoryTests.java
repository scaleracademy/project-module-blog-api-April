package com.scaler.blogapi.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.UUID;

@DataJpaTest
public class UsersRepositoryTests {
    @Autowired private UserRepository userRepository;


    @Test
    public void createUser() {
        UserEntity userEntity = new UserEntity(
                "testuser",
                "testemail@gmail.com",
                "testpassword",
                "testbio"
        );
        userEntity.setId(UUID.randomUUID());
        userEntity.setCreatedAt(new Date());
        var user = userRepository.save(userEntity);
        Assertions.assertNotNull(user.getId());
    }

    @Test
    public void findByUsername() {
        UserEntity userEntity = new UserEntity(
                "testuser",
                "testemail@gmail.com",
                "testpassword",
                "testbio"
        );

        userRepository.save(userEntity);

        var user = userRepository.findByUsername("testuser");
        System.out.println(user);
        Assertions.assertEquals("testemail@gmail.com", user.getEmail());
    }

}
