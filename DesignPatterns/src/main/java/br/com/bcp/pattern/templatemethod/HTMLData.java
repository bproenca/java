package br.com.bcp.pattern.templatemethod;

public class HTMLData extends Template {
	@Override
	protected String link(final String texto, final String url) {
		return "<a href='" + url + "'>" + texto + "</a>";
	}

	@Override
	protected String transform(final String texto) {
		return texto.toLowerCase();
	}
}