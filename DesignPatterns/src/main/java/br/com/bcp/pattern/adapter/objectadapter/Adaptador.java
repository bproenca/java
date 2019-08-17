package br.com.bcp.pattern.adapter.objectadapter;

/**
 * Adaptador possui referência para objeto que terá sua interface adaptada
 * (instância de ClasseExistente).
 * 
 * Cada método de Alvo chama o(s) método(s) correspondente(s) na interface
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
		System.out.println("Cria referência (composição) para objeto que "
				+ "terá sua interface adaptada (ClasseExistente).");
		ce = new ClasseExistente();
	}

	public void operacao() {
		System.out.println("Adaptador.operacao()");
		ce.metodoUtil();
	}

}
