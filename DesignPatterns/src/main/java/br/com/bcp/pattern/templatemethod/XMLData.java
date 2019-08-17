package br.com.bcp.pattern.templatemethod;

public class XMLData extends Template {
	@Override
	protected String link(final String texto, final String url) {
		return "<endereco xlink:href='" + url + "'>" + texto + "</endereco>";
	}
}