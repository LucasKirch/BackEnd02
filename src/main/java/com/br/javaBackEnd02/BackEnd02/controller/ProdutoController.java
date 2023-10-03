package com.br.javaBackEnd02.BackEnd02.controller;

import com.br.javaBackEnd02.BackEnd02.dto.ProdutoDTO;
import com.br.javaBackEnd02.BackEnd02.dto.VendaDTO;
import com.br.javaBackEnd02.BackEnd02.entity.Produto;
import com.br.javaBackEnd02.BackEnd02.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        Produto produtoCreated = service.create(produto);

        return ResponseEntity.status(201).body(produtoCreated);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> update(@RequestBody Produto produto) {
        Produto produtoCreated = service.create(produto);

        return ResponseEntity.status(201).body(produtoCreated);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/vendas-produtos-alto-lucro")
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoDTO> produtosAltoLucro() {
        return service.getProdutosComAltoLucro();
    }

}
