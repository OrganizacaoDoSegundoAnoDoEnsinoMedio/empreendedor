package br.com.infoa.backend.senai.empreendedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infoa.backend.senai.empreendedor.Repositories.EmpreendedorRepository;

@Service
public class EmpreendedorService {

    @Autowired
    private EmpreendedorRepository empreendedorRepository;

    public Long contar() {
        return empreendedorRepository.count();
    }
}