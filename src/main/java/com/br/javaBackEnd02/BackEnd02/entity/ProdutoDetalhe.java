package com.br.javaBackEnd02.BackEnd02.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity

@SqlResultSetMapping(
        name="ProdutoDetalhesMapping",
        classes={
                @ConstructorResult(
                        targetClass=Produto.class,
                        columns={
                                @ColumnResult(name="idProduto", type=Integer.class),
                                @ColumnResult(name="nome", type=String.class)})})

public class ProdutoDetalhe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "produtoDetalhe")
    private Produto produto;

    private double valorCompra;
    private double valorVenda;
    private String dataVencimento;

}
