package br.com.bcp.pattern.mediator;

interface Command {
	void execute();
}

/*
 * Definition Define an object that encapsulates details and other objects
 * interact with such object. The relationships are loosely decoupled. Where to
 * use & benefits Partition a system into pieces or small objects. Centralize
 * control to manipulate participating objects(a.k.a colleagues) Clarify the
 * complex relationship by providing a board committee. Limit subclasses.
 * Improve objects reusabilities. Simplify object protocols. The relationship
 * between the control class and other participating classes is
 * multidirectional. Related patterns include Facade, which abstracts a
 * subsystem to provide a more convenient interface, and its protocol is
 * unidirectional, whereas a mediator enables cooperative behavior and its
 * protocol is multidirectional. Command, which is used to coordinate
 * functionality. Observer, which is used in mediator pattern to enhance
 * communication.
 */
