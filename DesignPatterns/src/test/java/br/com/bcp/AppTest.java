/**
 * 
 */
package br.com.bcp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * @author bruno.proenca
 * 
 */
public class AppTest {

	private App app;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	/**
	 * Test method for {@link br.com.bcp.App#saySomething()}.
	 */
	@Test
	public void testSaySomething() {
		Assert.assertNotNull(app.saySomething());
	}

}
