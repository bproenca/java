package br.com.bcp.tdd.domain.service;

import br.com.bcp.tdd.domain.model.User;

/**
 * Complex authentication algorithm rsrsrs
 * 
 * @author bruno.proenca
 */
public class Authenticator {

	public boolean authenticate(User user, String password) {
		return user.getPassword().equals(password);
	}
}
