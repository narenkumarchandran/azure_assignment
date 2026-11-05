package com.example.cicd;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String API_KEY_HEADER = "8ac4a3033df230868edd89debdeb091eef86b291";
    private static final String API_SECRET_HEADER = "8ac4a3033df230868edd89debdeb091eef86b291egvgvs";

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "application", "DevOps CIA 2",
                "version", "v1",
                "status", "Updated the application!",
                "value", String.valueOf(3/0)
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
