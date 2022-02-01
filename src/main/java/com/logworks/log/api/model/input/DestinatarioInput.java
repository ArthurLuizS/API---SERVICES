package com.logworks.log.api.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioInput {
	private String nome;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
}
