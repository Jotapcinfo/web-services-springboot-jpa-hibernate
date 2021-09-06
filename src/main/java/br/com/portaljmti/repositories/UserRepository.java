package br.com.portaljmti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portaljmti.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}