package br.com.bcp.pattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

// While the interpreter pattern does not address parsing a parser is provided for completeness
class Evaluator {
	private Expression syntaxTree;

	public Evaluator(String expression) {
		Stack<Expression> expressionStack = new Stack<Expression>();
		for (String token : expression.split(" ")) {
			if (token.equals("+")) {
				Expression subExpression = new Plus(expressionStack.pop(),
						expressionStack.pop());
				expressionStack.push(subExpression);
			} else if (token.equals("-")) {
				Expression subExpression = new Minus(expressionStack.pop(),
						expressionStack.pop());
				expressionStack.push(subExpression);
			} else
				expressionStack.push(new Variable(token));
		}
		syntaxTree = expressionStack.pop();
	}

	public int evaluate(HashMap<String, Integer> context) {
		return syntaxTree.interpret(context);
	}
}
