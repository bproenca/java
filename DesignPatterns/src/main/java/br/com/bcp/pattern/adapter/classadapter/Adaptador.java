package br.com.bcp.pattern.adapter.classadapter;

/**
 * Adaptador (Adapter): adapta a interface do Recurso(ClasseExistente) à
 * interface Alvo
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class Adaptador extends ClasseExistente implements Alvo {

	public void operacao() {
		System.out.println("Adaptador.operacao()");
		metodoUtil();
	}

}
