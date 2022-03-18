package com.defensoria.crudconceitoassistido.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "contato")
@Entity
@Getter
@Setter
public class Contato implements Serializable {

    private static final long serialVersionUID = 6093975916559642781L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private Long id;

    private Integer ddd;
    private Integer numero;


//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_assistido") // representa a coluna na tabela contato
//    private Assistido assistido;

}
