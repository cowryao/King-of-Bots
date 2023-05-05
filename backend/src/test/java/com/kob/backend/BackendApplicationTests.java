package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("pyjh"));
        System.out.println(passwordEncoder.matches("pyjh","$2a$10$uQYi4nGMf8JcuAh.ds0hNu7fMWDcZcLHCSB6Nb8MbAXCDiA5pCjLC"));
    }

}
