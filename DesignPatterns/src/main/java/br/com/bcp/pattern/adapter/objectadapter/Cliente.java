package br.com.bcp.pattern.adapter.objectadapter;

/**
 * Cliente: aplicação que colabora com objetos aderentes à interface Alvo
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
