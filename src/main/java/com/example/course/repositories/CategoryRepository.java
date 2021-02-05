package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	//não precisa fazer a implementação quando se extende a classe JpaRepository, já tem uma implementação padrão
}
