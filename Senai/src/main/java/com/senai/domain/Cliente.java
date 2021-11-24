package com.senai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.ArrayList; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType; 
import javax.persistence.GeneratedValue; 
import javax.persistence.ElementCollection; 
import javax.persistence.Column;
import javax.persistence.CollectionTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senai.domain.enum1.TipoCliente;


@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCliente; 
	
	private String nome; 
	private String CpfouCnpj;
	   //Usar enum
		private Integer tipo;    
	@Column(unique= true)
	private String email; 
	@ElementCollection
	@CollectionTable(name="Telefone")
	private Set<String> telefones = new HashSet<>();
    
	@JsonIgnore
	//Construtor
	public Cliente() {
		
	}
public Cliente(Integer idCliente, String nome, String cpfouCnpj, String email, 
		TipoCliente tipo) {
		super();
		IdCliente = idCliente;
		this.nome = nome;
		CpfouCnpj = cpfouCnpj;
		this.email = email;
	    this.tipo = tipo.getCod();
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpfouCnpj() {
	return CpfouCnpj;
}
public void setCpfouCnpj(String cpfouCnpj) {
	CpfouCnpj = cpfouCnpj;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Set<String> getTelefones() {
	return telefones;
}
public void setTelefones(Set<String> telefones) {
	this.telefones = telefones;
}
public void setIdCliente(Integer idCliente) {
	IdCliente = idCliente;
}
@Override
public int hashCode() {
	return Objects.hash(IdCliente);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	return Objects.equals(IdCliente, other.IdCliente);
}

   public TipoCliente getTipo() {
	   return TipoCliente.toEnum(tipo); 
   }
   public void setTipo(TipoCliente tipo) {
	   this.tipo = tipo.getCod();
   }
	
}
