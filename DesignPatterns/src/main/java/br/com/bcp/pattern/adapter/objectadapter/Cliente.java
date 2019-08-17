package br.com.bcp.pattern.adapter.objectadapter;

/**
 * Cliente: aplica��o que colabora com objetos aderentes � interface Alvo
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class Cliente {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Alvo alvo = new Adaptador();
		alvo.operacao();
	}
}
