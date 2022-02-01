package com.logworks.log.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.logworks.log.domain.exception.NegocioException;
import com.logworks.log.domain.model.Entrega;
import com.logworks.log.domain.model.Ocorrencia;
import com.logworks.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
	private BuscaEntregaService buscaEntregaService;
	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
	}
}
