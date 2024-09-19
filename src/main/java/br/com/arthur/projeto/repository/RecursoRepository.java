package br.com.arthur.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
