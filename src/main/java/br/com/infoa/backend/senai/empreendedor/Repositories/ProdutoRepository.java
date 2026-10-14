package br.com.infoa.backend.senai.empreendedor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoa.backend.senai.empreendedor.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
