package com.br.javaBackEnd02.BackEnd02.service;

import com.br.javaBackEnd02.BackEnd02.entity.Produto;
import com.br.javaBackEnd02.BackEnd02.entity.ProdutoDetalhe;
import com.br.javaBackEnd02.BackEnd02.repository.ProdutoDetalheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoDetalheService {
    @Autowired
    private ProdutoDetalheRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<ProdutoDetalhe> findAll() {
        return repository.findAll();
    }

    public Optional<ProdutoDetalhe> findById(ProdutoDetalhe produtoDetalhe,Long id) {
        return repository.findById(id);
    }

    public ProdutoDetalhe create(ProdutoDetalhe produtoDetalhe) { return repository.save(produtoDetalhe);}

    public ProdutoDetalhe update(ProdutoDetalhe produtoDetalhe){ return repository.save(produtoDetalhe);}

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<ProdutoDetalhe> buscarDetalheProduto(Long id){
        Query query = entityManager.createNativeQuery("select d.* from produto p" +
                "  join produtoDetalhe pd on p.id = pd.idProduto" +
                "  where p.id = " + id, "ProdutoDetalhesMapping");
        List<ProdutoDetalhe> produtoDetalhes = query.getResultList();
        return produtoDetalhes;
    }

}
