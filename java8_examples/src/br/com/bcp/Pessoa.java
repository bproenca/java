package br.com.bcp;

public class Pessoa {

    private Integer idade;

    private String nome;

    public Pessoa(String nome, Integer idade) {
	this.nome = nome;
	this.idade = idade;
    }

    @Override public boolean equals(final Object pO) {
	if (this == pO) {
	    return true;
	}
	if (pO == null || getClass() != pO.getClass()) {
	    return false;
	}

	final Pessoa pessoa = (Pessoa) pO;

	if (idade != null ? !idade.equals(pessoa.idade) : pessoa.idade != null) {
	    return false;
	}
	return nome != null ? nome.equals(pessoa.nome) : pessoa.nome == null;

    }

    public Integer getIdade() {

	return idade;
    }

    public String getNome() {
	return nome;
    }

    @Override public int hashCode() {
	int result = idade != null ? idade.hashCode() : 0;
	result = 31 * result + (nome != null ? nome.hashCode() : 0);
	return result;
    }

    public void setIdade(final Integer pIdade) {
	idade = pIdade;
    }

    public void setNome(final String pNome) {
	nome = pNome;
    }

    @Override public String toString() {
	return "Pessoa{" +
			"idade=" + idade +
			", nome='" + nome + '\'' +
			'}';
    }
}
