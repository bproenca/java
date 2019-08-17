package br.com.bcp.pattern.interpreter;

import java.util.HashMap;

interface Expression {
	public int interpret(HashMap<String, Integer> variables);
}
