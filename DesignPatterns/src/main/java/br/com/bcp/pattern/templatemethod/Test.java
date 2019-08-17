package br.com.bcp.pattern.templatemethod;

public class Test {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		Template template = new XMLData();
		System.out.println(template.templateMethod());

		template = new HTMLData();
		System.out.println(template.templateMethod());
	}

}
