package br.com.infoa.backend.senai.empreendedor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoa.backend.senai.empreendedor.Models.Empreendedor;

public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Integer> {

}
