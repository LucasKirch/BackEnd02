package com.br.javaBackEnd02.BackEnd02.entity;

import lombok.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private float preco;

}
