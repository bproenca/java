package br.com.bcp.caelum;

import java.util.Collection;

/**
 * Vamos enxergar o problema ao se usar uma classe que não é thread-safe: a ArrayList por exemplo.
 * <p>
 * Imagine que temos um objeto que guarda todas as mensagens que uma aplicação de chat recebeu.
 * Vamos usar uma ArrayList<String> para armazená-las. Nossa aplicação é multi-thread, então diferentes
 * threads vão inserir diferentes mensagens para serem registradas. Não importa a ordem que elas sejam
 * guardadas, desde que elas um dia sejam!
 */
public class ProduzMensagens implements Runnable {
    private int comeco;

    private int fim;

    private Collection<String> mensagens;

    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }

    /**
     * Com o synchronized vai funcionar ok
     */
    public void run() {
        //synchronized (mensagens) {
        for (int i = comeco; i < fim; i++) {
            mensagens.add("Mensagem " + i);
        }
        //}
    }
}