package com.br.javaBackEnd02.BackEnd02.dto;

import com.br.javaBackEnd02.BackEnd02.entity.ProdutoDetalhe;
import com.br.javaBackEnd02.BackEnd02.entity.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class VendaDTO {

    ProdutoDTO produtoDTO;
    private String nomeComprador;

}
