package com.senai.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
@Entity
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_cidade")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInteger;
	
	@Column(name = "nome_cidade")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;
	
	public Cidade() {
		
	}

	public Cidade(Integer idInteger, String nome, Estado estado) {
		super();
		this.idInteger = idInteger;
		this.nome = nome;
		this.estado = estado;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idInteger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(idInteger, other.idInteger);
	}
	
}
