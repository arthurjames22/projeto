package br.com.arthur.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
}
