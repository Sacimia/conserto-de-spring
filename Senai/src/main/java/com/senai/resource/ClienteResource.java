package com.senai.resource;


import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.senai.domain.Cliente;
import com.senai.services.ClienteServices;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

	@Autowired 
	private  ClienteServices services;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(PathVariable Integer id){
	   	Cliente obj = services.buscar(id);
	   	return ResponseEntity.ok().body(obj);
	}	
	
	
	
		public Cliente buscar(Integer IdCliente){
		
	
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<Void> insert(@Valid @RequestBody Cliente obj){
		obj = ClienteServices.insert(obj);
		URI	 uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCliente()).toUri();
		return ResponseEntity.created(uri).build();
		};
		
	
		//Faz update 
		@RequestMapping(value = "{/id}", method = RequestMethod.PUT)
		public ResponseEntity<Void> update(@RequestBody Cliente obj, @PathVariable Integer id){
		     obj.setIdCliente(id);
		     obj = ClienteServices.update(obj);
		     return ResponseEntity.noContent().build(); 
		}
		
		@RequestMapping(value = "{/id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> delete(@PathVariable Integer id){
			ClienteServices.delete(id);
			return ResponseEntity.noContent().build(); 
		}
		public
	}
}