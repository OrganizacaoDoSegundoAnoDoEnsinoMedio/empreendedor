package br.com.infoa.backend.senai.empreendedor.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "endereco")
public class Endereco {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "cep")
    private String cep;

    @Column (name = "numero")
    private String numero;

    @Column (name = "logradouro")
    private String logradouro;

    @ManyToOne 
    @JoinColumn(name = "empreendedor_id")
    private Empreendedor empreendedor;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String numero, String logradouro, Empreendedor empreendedor) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.empreendedor = empreendedor;
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Empreendedor getEmpreendedor() {
        return empreendedor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setEmpreendedor(Empreendedor empreendedor) {
        this.empreendedor = empreendedor;
    }

    

}
