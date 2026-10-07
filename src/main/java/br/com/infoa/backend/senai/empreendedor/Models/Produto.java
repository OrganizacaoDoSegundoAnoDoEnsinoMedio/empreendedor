package br.com.infoa.backend.senai.empreendedor.Models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "dataFabricacao")
    private LocalDate dataFabricacao;

    @Column (name = "preco")
    private Double preco;

    @ManyToMany 
    @JoinTable(
        name = "produto_empreendedor",
        joinColumns = @JoinColumn(name = "produto_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "empreendedor_id", referencedColumnName = "id")
    )
    private List<Empreendedor> empreendedores;

    public Produto() {
    }

    public Produto(Long id, String nome, LocalDate dataFabricacao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }

    

}
