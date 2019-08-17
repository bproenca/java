/**
 * 
 */
package br.com.bcp.ioc;

import junit.framework.Assert;

import org.junit.Test;

import br.com.bcp.ioc.guice.GuiceProdModule;
import br.com.bcp.ioc.guice.GuiceTestModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Example: using 2 different Module, 1 for Production and 1 for Test 
 * @author bruno.proenca
 */
public class StoreTest {

	/**
	 * Test method for {@link br.com.bcp.ioc.Store#showBooks()}.
	 */
	@Test
	public void testShowBooksProduction() {
		Injector injector = Guice.createInjector(new GuiceProdModule());
	    Store store = injector.getInstance(Store.class);
	    
	    Assert.assertEquals("BookRepositoryDao: returning all books", store.showBooks());
	}

	/**
	 * Test method for {@link br.com.bcp.ioc.Store#showBooks()}.
	 */
	@Test
	public void testShowBooksTest() {
	    Injector injector = Guice.createInjector(new GuiceTestModule());
	    Store store = injector.getInstance(Store.class);
	    
	    Assert.assertEquals("BookRepositoryFake: returning all books", store.showBooks());
	}
}
