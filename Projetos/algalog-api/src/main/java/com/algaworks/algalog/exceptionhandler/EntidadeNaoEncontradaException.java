package com.algaworks.algalog.exceptionhandler;

import com.algaworks.algalog.domain.exception.NegocioException;

public class EntidadeNaoEncontradaException extends NegocioException{
	
	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontradaException(String message) {
		super(message);
	
	}

}
