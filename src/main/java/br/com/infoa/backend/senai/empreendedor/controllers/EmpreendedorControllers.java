package br.com.infoa.backend.senai.empreendedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoa.backend.senai.empreendedor.Models.Empreendedor;
import br.com.infoa.backend.senai.empreendedor.services.EmpreendedorService;



@RestController
@RequestMapping ("/empreendedor")
public class EmpreendedorControllers {

    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }

    @GetMapping("/listar")
    public List<Empreendedor> listar() {
        return empreendedorService.listar();
    }

    @GetMapping("/buscar/{id}")
    public Empreendedor buscarPorId(@PathVariable Integer id) {
        return empreendedorService.buscarPorId(id);
    }
    
}