package br.com.bcp.ioc;

import br.com.bcp.ioc.rep.BookRepository;

import com.google.inject.Inject;

/**
 * @author bruno.proenca
 */
public class Store {

	private BookRepository bookRepository;
	
	/**
	 * This constructor is invoked by Guice
	 * @param bookRepository
	 */
	@Inject
	public Store(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public String showBooks() {
		return bookRepository.listBooks();
	}
}
