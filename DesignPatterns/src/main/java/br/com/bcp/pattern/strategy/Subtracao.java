package br.com.bcp.pattern.strategy;

public class Subtracao implements Operacao {

	public int executar(int operador1, int operador2) {
		return operador1 - operador2;
	}

}
