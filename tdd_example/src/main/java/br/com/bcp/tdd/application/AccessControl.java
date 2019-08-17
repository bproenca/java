package br.com.bcp.tdd.application;

import br.com.bcp.tdd.domain.model.User;
import br.com.bcp.tdd.domain.rep.UsersRepository;
import br.com.bcp.tdd.domain.service.Authenticator;

/**
 * @author bruno.proenca
 */
public class AccessControl {

	private final UsersRepository usersRepository;
	private final Authenticator authenticator;

	public AccessControl(UsersRepository usersRepository, Authenticator authenticator) {
		this.usersRepository = usersRepository;
		this.authenticator = authenticator;
	}

	/**
	 * Execute login using name/password.
	 * If the User exists and authentication is OK then return the User.
	 * 
	 * @param name
	 * @param password
	 * @return User if successfull authentication 
	 */
	public User login(String name, String password) {
		User user = usersRepository.findByName(name);
		if (user != null && !authenticator.authenticate(user, password)) {
			user = null;
		}
		return user;
	}

}
