package br.com.bcp.ioc.guice;

import br.com.bcp.ioc.rep.BookRepository;
import br.com.bcp.ioc.rep.BookRepositoryFake;

import com.google.inject.AbstractModule;

public class GuiceTestModule extends AbstractModule {

	@Override
	protected void configure() {
		/*
		 * This tells Guice that whenever it sees a dependency on a BookRepository,
		 * it should satisfy the dependency using a BookRepositoryFake.
		 */
		bind(BookRepository.class).to(BookRepositoryFake.class);
	}

}
