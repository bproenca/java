package br.com.bcp.pattern.adapter.objectadapter;

/**
 * Adaptador possui refer�ncia para objeto que ter� sua interface adaptada
 * (inst�ncia de ClasseExistente).
 * 
 * Cada m�todo de Alvo chama o(s) m�todo(s) correspondente(s) na interface
 * adaptada.
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class Adaptador implements Alvo {

	/**
     * 
     */
	final ClasseExistente ce;

	/**
     * 
     */
	public Adaptador() {
		System.out.println("Cria refer�ncia (composi��o) para objeto que "
				+ "ter� sua interface adaptada (ClasseExistente).");
		ce = new ClasseExistente();
	}

	public void operacao() {
		System.out.println("Adaptador.operacao()");
		ce.metodoUtil();
	}

}
