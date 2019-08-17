/**
 * 
 */
package br.com.bcp.tdd.infra;

import java.util.HashMap;
import java.util.Map;

import br.com.bcp.tdd.domain.model.User;
import br.com.bcp.tdd.domain.rep.UsersRepository;

/**
 * Fake database repository
 * 
 * @author bruno.proenca
 */
public class UsersRepositoryDAO implements UsersRepository {

	// my fake database
	private final Map<String, User> database = new HashMap<String, User>();
	
	/* (non-Javadoc)
	 * @see br.com.bcp.tdd.domain.rep.UsersRepository#findByName(java.lang.String)
	 */
	public User findByName(String name) {
		return database.get(name);
	}

	/* (non-Javadoc)
	 * @see br.com.bcp.tdd.domain.rep.UsersRepository#save(br.com.bcp.tdd.domain.model.User)
	 */
	public void save(User user) {
		database.put(user.getName(), user);
	}

	/* (non-Javadoc)
	 * @see br.com.bcp.tdd.domain.rep.UsersRepository#remove(br.com.bcp.tdd.domain.model.User)
	 */
	public void remove(User user) {
		database.remove(user);
	}

}
