package br.com.bcp.pattern.templatemethod;

public abstract class Template {
	protected abstract String link(String texto, String url);

	public final String templateMethod() {
		final String msg = "Endereço: "
				+ link("Empresa", "http://www.empresa.com");
		return transform(msg);
	}

	protected String transform(final String texto) {
		return texto;
	}
}