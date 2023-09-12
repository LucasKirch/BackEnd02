package com.br.javaBackEnd02.BackEnd02.controller;

import com.br.javaBackEnd02.BackEnd02.entity.Produto;
import com.br.javaBackEnd02.BackEnd02.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    @Autowired
    ProdutoService service;

    @GetMapping("/lista-por-nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> buscarNome(@PathVariable String nome) {
        return service.listPorNome(nome);}
}
