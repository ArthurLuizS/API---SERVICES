package com.logworks.log.api.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {
	
	private ClienteIdInput clienteId;
	
	private DestinatarioInput destinatario;
	
	private BigDecimal taxa;
	
	
}
