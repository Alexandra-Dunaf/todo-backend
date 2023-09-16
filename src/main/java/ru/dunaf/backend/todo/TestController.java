package ru.dunaf.backend.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/test")
    public String get() {
        return "test work";
    }
}
