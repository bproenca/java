package br.com.bcp.ioc.rep;

/**
 * Repository used in test environment
 * @author bruno.proenca
 */
public class BookRepositoryFake implements BookRepository {

	public String listBooks() {
		return "BookRepositoryFake: returning all books";
	}

}
