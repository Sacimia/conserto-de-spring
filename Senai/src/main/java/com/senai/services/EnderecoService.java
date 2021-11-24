package com.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.repositories.EnderecoRepository;
import com.senai.repositories.EstadoRepository;
import com.senai.repositories.CidadeRepository;
import com.senai.repositories.Clienterepository;
@Service
public class EnderecoService {
      @Autowired
      private EnderecoRepository enderecorepository;
      
      @Autowired
      private Clienterepository  clienterepository;
      
      @Autowired
      private CidadeRepository  cidaderepository;
      
      @Autowired
      private EstadoRepository  estadorepository;
}
