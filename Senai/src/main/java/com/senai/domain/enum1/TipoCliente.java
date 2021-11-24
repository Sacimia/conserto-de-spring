package com.senai.domain.enum1;

public enum TipoCliente {
    //estático
	PessoaFisica(1, "Pessoa Física"), PessoaJuridica(2, "Pessoa Jurídica");
	
	//Atributos
	private int cod; 
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod =cod;
		this.descricao = descricao;
	}
	
	//Getters 
	public int getCod(){
		return cod; 
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(TipoCliente x: TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
			return x;	
			}
		}
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}
