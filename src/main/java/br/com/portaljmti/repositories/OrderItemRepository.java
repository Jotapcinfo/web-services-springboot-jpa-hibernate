package br.com.portaljmti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portaljmti.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}