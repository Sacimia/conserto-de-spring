package com.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.domain.Cliente;

@Repository
public interface Clienterepository  extends JpaRepository<Cliente, Integer>{
		

}
