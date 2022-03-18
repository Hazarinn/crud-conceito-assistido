package com.defensoria.crudconceitoassistido.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assistido")
@Getter
@Setter
public class Assistido implements Serializable {

    private static final long serialVersionUID = 6093975916559642789L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Column(name = "nome")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_assistido_FK")
    private List<Contato> contatos = new ArrayList<>();

    @Column(name ="cep")
    private String cep;

    @Column(name ="logradouro")
    private String logradouro;

    @Column(name ="bairro")
    private String bairro;

    @Column(name ="cidade")
    private String cidade;




}
