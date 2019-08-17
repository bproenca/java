package br.com.bcp.pattern.adapter;

/* the client class should instantiate adapter objects */
/* by using a reference of this type */
interface Stack<T> {
	T pop();

	void push(T o);

	T top();
}
