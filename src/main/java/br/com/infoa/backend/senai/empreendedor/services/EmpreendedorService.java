package br.com.infoa.backend.senai.empreendedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infoa.backend.senai.empreendedor.Models.Empreendedor;
import br.com.infoa.backend.senai.empreendedor.Repositories.EmpreendedorRepository;

@Service
public class EmpreendedorService {

    @Autowired
    private EmpreendedorRepository empreendedorRepository;

    public Long contar() {
        return empreendedorRepository.count();
    }

    public List<Empreendedor> listar() {
        return empreendedorRepository.findAll();
    }

    public Empreendedor buscarPorId(Integer id) {
        return empreendedorRepository.findById(id).get();
    }


}