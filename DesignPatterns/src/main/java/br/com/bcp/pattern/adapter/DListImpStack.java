package br.com.bcp.pattern.adapter;

/* Adapt DList class to Stack interface is the adapter class */
class DListImpStack<T> extends DList<T> implements Stack<T> {

	public T pop() {
		return removeTail();
	}

	public void push(final T o) {
		insertTail(o);
	}

	public T top() {
		return getTail();
	}
}
