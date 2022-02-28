package com.devsuperior.course.repositories;

import com.devsuperior.course.entities.Category;
import com.devsuperior.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
