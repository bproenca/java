package br.com.bcp.tdd.application;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.bcp.tdd.domain.model.User;
import br.com.bcp.tdd.domain.rep.UsersRepository;
import br.com.bcp.tdd.domain.service.Authenticator;

/**
 * Mock {@link UsersRepository} and {@link Authenticator} to test {@link AccessControl} in isolation
 * 
 * @author bruno.proenca
 */
public class AccessControlIsolatedTest {

	private UsersRepository usersRepository;
	private Authenticator authenticator;

	@Before
	public void before() {
		usersRepository = EasyMock.createMock(UsersRepository.class);
		authenticator = EasyMock.createMock(Authenticator.class);
	}

	@Test
	public void test_when_successful_login_then_should_return_authentication_info() {
		User bob = new User("bob", "123");

		EasyMock.expect(usersRepository.findByName(EasyMock.eq("bob"))).andReturn(bob).once();
		EasyMock.expect(authenticator.authenticate(bob, "123")).andReturn(true).once();
		EasyMock.replay(usersRepository, authenticator);

		System.out.println("given that a user access the system");
		AccessControl accessControl = new AccessControl(usersRepository, authenticator);
		
		System.out.println("when he logs in with his user/pass");
		User user = accessControl.login("bob", "123");
		
		System.out.println("then I should return the authentication info");
		Assert.assertNotNull(user);
	}

	@After
	public void after() {
		EasyMock.verify(usersRepository, authenticator);
	}
}
