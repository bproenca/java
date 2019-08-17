package br.com.bcp.pattern.strategy;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new Soma());
		System.out.println(contexto.executaOperacao(4, 3));
		contexto.mudaOperacao(new Subtracao());
		System.out.println(contexto.executaOperacao(4, 3));
	}

}
