package br.com.ifpe.oxefoodalvaro.utils.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntidadeAuditavel extends EntidadeNegocio {
	
	private static final long serialVersionUID = 5907958791890813465L;
	private Long versao;
	private LocalDate dataCriacao;
	private LocalDate detaUltimaModificacao;
	private Long criadoPor;
	private Long ultimaModificacaoPor;

}
