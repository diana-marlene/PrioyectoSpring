package com.generation.PrioyectoSpring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Diana Sánchez Saludos desde Spring Boot!";
    }
}
