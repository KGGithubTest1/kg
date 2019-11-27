package com.example.demo;

import org.junit.jupiter.api.Test;
import org.kohsuke.github.GitHub;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest
class DemoApplicationTests {
    private static final String username = "";
    private static final String password = "";

    @Test
    void contextLoads() {
    }

    @Test
    void authentication() throws Exception{
        GitHub gitHub = GitHub.connectUsingPassword("username", "password");
        String kungeek = "";
    }

}
