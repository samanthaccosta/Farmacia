package br.org.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.farmacia.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);



}
