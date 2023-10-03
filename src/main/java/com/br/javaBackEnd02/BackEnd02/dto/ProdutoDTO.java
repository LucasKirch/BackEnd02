package com.br.javaBackEnd02.BackEnd02.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoDTO {

    private String nome;
    private double valorCompra;
    private double valorVenda;

}
