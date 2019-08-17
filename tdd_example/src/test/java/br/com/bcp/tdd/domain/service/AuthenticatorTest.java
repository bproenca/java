package br.com.bcp.tdd.domain.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bcp.tdd.domain.model.User;

/**
 * @author bruno.proenca
 */
public class AuthenticatorTest {
	
	private User user;
	
	@Before
	public void before() {
		user = new User("a", "b");
	}

	@Test
	public void test_successfull_authentication() {
		Assert.assertTrue(new Authenticator().authenticate(user, "b"));
	}
	
	@Test
	public void test_failure_authentication() {
		Assert.assertFalse(new Authenticator().authenticate(user, "c"));
	}

}
