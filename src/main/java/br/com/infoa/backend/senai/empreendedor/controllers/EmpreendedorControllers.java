package br.com.infoa.backend.senai.empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}