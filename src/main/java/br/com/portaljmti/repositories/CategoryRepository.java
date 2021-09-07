package br.com.portaljmti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portaljmti.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}