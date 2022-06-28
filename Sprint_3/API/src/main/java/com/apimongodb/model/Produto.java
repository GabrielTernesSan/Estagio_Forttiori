package com.apimongodb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Data
@Document
public class Produto {

    @Id
    private String codigo;

    private String nome;

    private String marca;

    private String descricao;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dataDeFabricacao;

    public Produto(String codigo, String nome, String marca) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
    }
}

