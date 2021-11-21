package com.diretoaocodigo.pedidos.domain.repository;

import com.diretoaocodigo.pedidos.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
