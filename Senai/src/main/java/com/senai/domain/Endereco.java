package com.senai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "cliente")
@Entity
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente; 
	private String nome;
	private String CpfouCnpj;
	private Integer tipo;
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	@Column(unique=true)
	private String email;
	@ElementCollection
	@CollectionTable(name = "telefone")
	private Set<String> telefone = new HashSet<>();
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	//Construtor
	public Endereco() {
		
	}

	public Endereco(Integer idCliente, String nome, String cpfouCnpj, Integer tipo, String email, Cliente cliente) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		CpfouCnpj = cpfouCnpj;
		this.tipo = tipo;
		this.email = email;
		this.cliente = cliente;
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<String> telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
		
}