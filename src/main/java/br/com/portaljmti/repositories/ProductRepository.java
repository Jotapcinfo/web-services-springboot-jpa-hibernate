package br.com.portaljmti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portaljmti.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}