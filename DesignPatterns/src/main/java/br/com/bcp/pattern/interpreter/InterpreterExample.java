package br.com.bcp.pattern.interpreter;

import java.util.HashMap;

// Finally evaluating the expression "w x z - +" with w = 5, x = 10, and z = 42
public class InterpreterExample {
	public static void main(String[] args) {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		HashMap<String, Integer> variables = new HashMap<String, Integer>();
		variables.put("w", 5);
		variables.put("x", 10);
		variables.put("z", 42);
		int result = sentence.evaluate(variables);
		System.out.println(result);
	}
}
