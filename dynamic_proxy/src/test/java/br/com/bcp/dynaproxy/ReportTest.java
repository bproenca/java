/**
 * 
 */
package br.com.bcp.dynaproxy;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.bcp.dynaproxy.client.ReportFactory;
import br.com.bcp.dynaproxy.client.User;
import br.com.bcp.dynaproxy.server.AppServer;

/**
 * @author bruno.proenca
 * 
 */
public class ReportTest {

	private AppServer server = new AppServer();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		server.start();
	}

	/**
	 * Test method for
	 * {@link br.com.bcp.dynaproxy.client.Report#printReport(java.util.List)}.
	 */
	@Test
	public void testPrintReport() {
		User user1 = new User("Bob", 45);
		User user2 = new User("Bill", 12);
		List<User> users = Arrays.asList(new User[] { user1, user2 });

		String expectedResult = user1.toString() + "\n" + user2.toString() + "\n";
		String actualResult = ReportFactory.createReport().printReport(users);

		Assert.assertEquals(expectedResult, actualResult);
		System.out.println(actualResult);
	}

}
