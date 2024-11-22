package br.edu.fatecpg.excecoes.services;

import br.edu.fatecpg.excecoes.exception.ValidarEmail;
import br.edu.fatecpg.excecoes.exception.ValidarNome;

public class ValidarCampos{
	
	public void validarNome(String nome) throws ValidarNome{
		if(nome.isEmpty()) {
			throw new ValidarNome();
		}
	}
	
	public void validarEmail(String email) throws ValidarEmail{
		if(!email.contains("@")) {
			throw new ValidarEmail();
		}
	}
}
