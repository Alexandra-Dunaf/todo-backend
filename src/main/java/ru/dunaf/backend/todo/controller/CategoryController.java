package ru.dunaf.backend.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dunaf.backend.todo.entity.Category;
import ru.dunaf.backend.todo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/id")
    public Category findById() {
        return service.findById(60140L);

    }
}
