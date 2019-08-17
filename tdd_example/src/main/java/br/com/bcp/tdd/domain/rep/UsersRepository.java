package br.com.bcp.tdd.domain.rep;

import br.com.bcp.tdd.domain.model.User;

/**
 * @author bruno.proenca
 */
public interface UsersRepository {

	User findByName(String name);

	void save(User user);

	void remove(User user);

}