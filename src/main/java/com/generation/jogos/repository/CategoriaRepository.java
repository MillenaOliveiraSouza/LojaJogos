package com.generation.jogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.jogos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
//foi criado esse novo metodo para buscar categorias pela descrição.
	   public List<Categoria> findAllByDescricaoCategoriaContainingIgnoreCase(@Param("descricaoCategoria") String descricaoCategoria);

}
