package com.logworks.log.domain.service;

import org.springframework.stereotype.Service;

import com.logworks.log.domain.exception.EntidadeNaoEncontradaException;
import com.logworks.log.domain.exception.NegocioException;
import com.logworks.log.domain.model.Entrega;
import com.logworks.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return 	 entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
