package com.br.javaBackEnd02.BackEnd02.entity;

import lombok.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "produto_detalhe_id", referencedColumnName = "id")
    ProdutoDetalhe produtoDetalhe;

    @ManyToMany
    Set<Venda> vendas;

}
