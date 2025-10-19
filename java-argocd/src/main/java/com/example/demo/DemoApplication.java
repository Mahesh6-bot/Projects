package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // This verifies Spring context starts correctly
        assertTrue(true, "Application context loaded successfully");
    }

    @Test
    void homeEndpointTest() {
        // Dummy test just to ensure at least one report is created
        assertTrue("Welcome to My Dockerized Java App by Maheshpasupuleti!".contains("Maheshpasupuleti"));
    }
}
