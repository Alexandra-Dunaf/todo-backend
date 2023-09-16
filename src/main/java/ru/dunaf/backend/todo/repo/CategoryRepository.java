package ru.dunaf.backend.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dunaf.backend.todo.entity.Category;

//описываем все доступные способы доступа к данным

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
