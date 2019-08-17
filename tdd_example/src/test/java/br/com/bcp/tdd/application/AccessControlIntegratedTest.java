package br.com.bcp.tdd.application;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.bcp.tdd.domain.model.User;
import br.com.bcp.tdd.domain.rep.UsersRepository;
import br.com.bcp.tdd.domain.service.Authenticator;
import br.com.bcp.tdd.infra.UsersRepositoryDAO;

/**
 * @author bruno.proenca
 */
public class AccessControlIntegratedTest {
	
	private UsersRepository usersRepository;
	private Authenticator authenticator;
	private AccessControl accessControl; 
	
	@Before
	public void before() {
		usersRepository = new UsersRepositoryDAO();
		authenticator = new Authenticator();
		
		usersRepository.save(new User("bill", "987"));
		System.out.println("---------------------");
	}
	
	@Test
	public void test_when_successful_login_then_should_return_authentication_info() {
		System.out.println("given that a user access the system");
		accessControl = new AccessControl(usersRepository, authenticator);
		
		System.out.println("when he logs in with a correct user/pass");
	  	User user = accessControl.login("bill", "987");
	  	
	  	System.out.println("then I should return the authentication info");
	  	Assert.assertNotNull(user);
	}
	
	@Test
	public void test_when_try_login_with_incorrect_pass_then_should_return_null() {
		System.out.println("given that a user access the system");
		accessControl = new AccessControl(usersRepository, authenticator);
		
		System.out.println("when he logs in with a wrong user/pass");
		User user = accessControl.login("bill", "wrong_pass");

		System.out.println("then I should return null");
		Assert.assertNull(user);
	}
}
