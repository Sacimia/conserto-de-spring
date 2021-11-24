package com.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.senai.repositories.Clienterepository;
import com.senai.repositories.EnderecoRepository;
import com.senai.domain.Cliente;
import com.senai.services.exceptions.ObjectNotFound;

@Service
public class ClienteServices {
		@Autowired
		private Clienterepository cli;
		
		
		//Cliente vem do Domain
		//Busca por id do cliente.
		public Cliente buscar(Integer IdCliente) {
			//Optional serve para não ter erro
			Optional<Cliente> obj = cli.findById(IdCliente);
			//return é um objeto
			return obj.orElseThrow(() -> new ObjectNotFound("Número de id não encontrado. Id: " + IdCliente + ", tipo: "+ Cliente.class.getName()));
		};
		
		//Busca pelo todos os clientes 
		public List<Cliente> findAll(){
	     	return cli.findAll();
	    }
	
	     public Cliente insert(Cliente obj) {
	        obj.setIdCliente(null);
	        obj= cli.save(obj);
	        EnderecoRepository.saveAll(obj.getEnderecos());
	        return obj;
	     }
		//Recebe o post na database
		
		
		public Cliente update(Cliente obj) {
		   	buscar(obj.getIdCliente());
		   	return cli.save(obj);
		}
		
		//Atualizar CLIENTE 
		
		public void delete(Integer id) {
			buscar(id);
			cli.deleteById(id);
		}
}

