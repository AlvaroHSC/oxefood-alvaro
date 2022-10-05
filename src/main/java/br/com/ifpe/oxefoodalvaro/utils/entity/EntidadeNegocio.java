package br.com.ifpe.oxefoodalvaro.utils.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public abstract class EntidadeNegocio implements  Serializable{
	
	private static final long serialVersionUID = -2292700767761413745L;
	
	private Long id;
	private Boolean habilitado;
}
