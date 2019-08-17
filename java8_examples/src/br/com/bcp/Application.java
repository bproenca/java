package br.com.bcp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bcp on 06/10/16.
 * http://www.matera.com/br/2015/01/23/entendendo-a-stream-api-do-java-8/
 */
public class Application {

	public static void main(String[] args) {
		final Application application = new Application();
		// example 1
		application.ex1_lambdaExample();
		System.out.println();

		// example 2
		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Joao", 32), new Pessoa("Antonio", 20),
				new Pessoa("Maria", 18), new Pessoa("Angela", 30), new Pessoa("Pedro", 20));
		application.ex2_streamExample(listaPessoas);

		// example 3
		application.ex3_parallelStreamExample(listaPessoas);

		// example 4
		application.ex4_streamSummaryExample(listaPessoas);

		// example 5
		application.ex5_intStream(listaPessoas);

		// example 6
		application.ex6_streamCollect(listaPessoas);

		// example 7
		application.ex7_streamGroupBy(listaPessoas);

		// example 7
		application.ex8_optional(listaPessoas);
	}

	private void ex1_lambdaExample() {
		System.out.println("# ex1_lambdaExample");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// Implementação tradicional
		for (Integer n : list) {
			System.out.print(n);
		}

		System.out.println();

		// Implementação com expressões lambda e StreamAPI
		list.forEach(n -> System.out.print(n));
	}

	private void ex2_streamExample(List<Pessoa> listaPessoas) {
		System.out.println("# ex2_streamExample");
		Stream<Pessoa> streamPessoas = listaPessoas.stream();

		Integer somaIdade = streamPessoas.filter(p -> p.getNome().startsWith("A")).mapToInt(p -> p.getIdade()).sum();
		System.out.println(somaIdade);
	}

	private void ex3_parallelStreamExample(List<Pessoa> listaPessoas) {
		System.out.println("# ex3_parallelStreamExample");
		Stream<Pessoa> streamPessoas = listaPessoas.parallelStream();
		Integer somaIdade = streamPessoas.filter(p -> p.getNome().startsWith("A")).mapToInt(p -> p.getIdade()).sum();
		System.out.println(somaIdade);
	}

	private void ex4_streamSummaryExample(List<Pessoa> listaPessoas) {
		System.out.println("# ex4_streamSummaryExample");
		Stream<Pessoa> streamPessoas = listaPessoas.stream();

		IntSummaryStatistics intSummStat = streamPessoas.filter(p -> p.getNome().startsWith("A"))
				.mapToInt(p -> p.getIdade()).summaryStatistics();

		System.out.println(intSummStat.getSum());
		System.out.println(intSummStat.getMax());
		System.out.println(intSummStat.getMin());
	}

	private void ex5_intStream(List<Pessoa> listaPessoas) {
		System.out.println("# ex5_intStream");

		IntStream intStream = listaPessoas.stream().mapToInt(p -> p.getIdade());
		Double mediaIdades = intStream.average().getAsDouble();
		System.out.println(mediaIdades);
	}

	private void ex6_streamCollect(List<Pessoa> pListaPessoas) {
		System.out.println("# ex6_collect");

		List<Pessoa> listPessoas = pListaPessoas.stream().filter(p -> p.getNome().startsWith("A"))
				.collect(Collectors.toList());
		System.out.print(listPessoas);
		System.out.println(listPessoas.getClass());

		Set<Pessoa> setPessoas = pListaPessoas.stream().filter(p -> p.getNome().startsWith("A"))
				.collect(Collectors.toSet());
		System.out.print(setPessoas);
		System.out.println(setPessoas.getClass());
	}

	private void ex7_streamGroupBy(List<Pessoa> listaPessoas) {
		System.out.println("# ex7_streamGroupBy");
		/*
		 * Nesse exemplo, agrupamos as pessoas por idade passando para o método
		 * groupingBy(), a expressão lambda “Pessoa::getIdade” que acessa a idade de
		 * cada pessoa da lista. O resultado é um Map em que a chave é uma “idade” e o
		 * valor é uma lista de pessoas que possuem essa idade.
		 */
		Map<Integer, List<Pessoa>> map = listaPessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));

		map.get(20).forEach(p -> System.out.println(p.getNome()));
	}

	private void ex8_optional(List<Pessoa> listaPessoas) {
		System.out.println("# ex7_streamGroupBy");

		Optional<Pessoa> optPessoa = listaPessoas.stream().filter(p -> p.getIdade() > 20).findFirst();

		if (optPessoa.isPresent()) {
			Pessoa p = optPessoa.get();
			System.out.println(p.getIdade());
		}

		optPessoa.ifPresent(p -> System.out.println(p.getIdade()));

		// optPessoa.orElseThrow();
		// optPessoa.orElse(new Pessoa("Joao", 28));

		// #### agora qdo findFirst não retorna nada

		optPessoa = listaPessoas.stream().filter(p -> p.getIdade() > 40) // sem match
				.findFirst();

		optPessoa.ifPresent(p -> System.out.println(p.getIdade()));
		System.out.println(optPessoa.orElse(new Pessoa("NoName", 44)));
	}

}
