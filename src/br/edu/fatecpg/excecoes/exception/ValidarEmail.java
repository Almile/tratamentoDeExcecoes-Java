package br.edu.fatecpg.excecoes.exception;

public class ValidarEmail extends Exception {

	public ValidarEmail() {
		super("Email inválido. O email deve conter @!");
	}

}
