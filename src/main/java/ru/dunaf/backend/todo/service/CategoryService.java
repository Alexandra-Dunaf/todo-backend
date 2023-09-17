package ru.dunaf.backend.todo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dunaf.backend.todo.entity.Category;
import ru.dunaf.backend.todo.repo.CategoryRepository;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category findById (Long id) {
        return repository.findById(id).get();
    }

    public List<Category> findAll(String email) {
        return repository.findByUserEmailOrderByTitleAsc(email);
    }


    public Category add(Category category) {
        return repository.save(category);
    }
}
