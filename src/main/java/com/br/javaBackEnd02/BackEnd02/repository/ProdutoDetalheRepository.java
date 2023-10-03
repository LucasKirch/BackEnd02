package com.br.javaBackEnd02.BackEnd02.repository;

import com.br.javaBackEnd02.BackEnd02.entity.ProdutoDetalhe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoDetalheRepository extends JpaRepository<ProdutoDetalhe,Long> {
}
