package br.com.portaljmti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portaljmti.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}