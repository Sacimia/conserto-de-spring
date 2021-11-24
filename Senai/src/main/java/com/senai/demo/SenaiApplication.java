package com.senai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.Override;
import java.util.Arrays;
import com.senai.domain.Estado;
import com.senai.repositories.CidadeRepository;
import com.senai.repositories.Clienterepository;
import com.senai.repositories.EstadoRepository;
@SpringBootApplication
public class SenaiApplication implements CommandLineRunner{
	
	@Autowired
	private EstadoRepository estadorepository;
	
	@Autowired
	private Clienterepository clienterepository;
	
	@Autowired
	private CidadeRepository cidaderepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
	}
	@Override
	public void run(String[] args) {
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		estadorepository.saveAll(Arrays.asList(est1, est2));
    }
	public Clienterepository getClienterepository() {
		return clienterepository;
	}
	public void setClienterepository(Clienterepository clienterepository) {
		this.clienterepository = clienterepository;
	}
	public CidadeRepository getCidaderepository() {
		return cidaderepository;
	}
	public void setCidaderepository(CidadeRepository cidaderepository) {
		this.cidaderepository = cidaderepository;
	}
}