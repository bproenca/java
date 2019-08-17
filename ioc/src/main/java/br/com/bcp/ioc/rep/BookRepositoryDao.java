package br.com.bcp.ioc.rep;

/**
 * Repository used in production environment
 * @author bruno.proenca
 */
public class BookRepositoryDao implements BookRepository {

	public String listBooks() {
		return "BookRepositoryDao: returning all books";
	}

}
