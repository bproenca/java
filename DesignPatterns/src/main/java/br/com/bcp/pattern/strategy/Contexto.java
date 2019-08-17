package br.com.bcp.pattern.strategy;

public class Contexto {

	private Operacao operacao;

	public Contexto(Operacao pOperacao) {
		super();
		operacao = pOperacao;
	}

	public int executaOperacao(int operador1, int operador2) {
		System.out.println("Executado operação: "
				+ operacao.getClass().getSimpleName());
		return operacao.executar(operador1, operador2);
	}

	public void mudaOperacao(Operacao pOperacao) {
		operacao = pOperacao;
	}
}
