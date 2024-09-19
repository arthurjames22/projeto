package br.com.arthur.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arthur.projeto.dto.RecursoDTO;
import br.com.arthur.projeto.entity.RecursoEntity;
import br.com.arthur.projeto.repository.RecursoRepository;

@Service
public class RecursoService {
	
		@Autowired
		private RecursoRepository recursoRepository;
	
		
		public List<RecursoDTO> listarTodos () {
			List<RecursoEntity> recursos = recursoRepository.findAll();
			return recursos.stream().map(RecursoDTO::new).toList();
		}
		
			
		public void inserir (RecursoDTO recurso) {
			RecursoEntity recursoEntity = new RecursoEntity(recurso);
			recursoRepository.save(recursoEntity);
		}
		
		
		public RecursoDTO alterar (RecursoDTO recurso) {
			RecursoEntity recursoEntity = new RecursoEntity(recurso);
			return new RecursoDTO(recursoRepository.save(recursoEntity));
		}
		
		
		public void excluir (Long id) {
			RecursoEntity recurso = recursoRepository.findById(id).get();
			recursoRepository.delete(recurso);
		}
	}

