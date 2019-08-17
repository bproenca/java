package br.com.bcp.pattern.interpreter;

import java.util.HashMap;

class Number implements Expression {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	public int interpret(HashMap<String, Integer> variables) {
		return number;
	}
}