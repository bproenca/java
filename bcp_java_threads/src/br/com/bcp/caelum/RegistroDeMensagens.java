package br.com.bcp.caelum;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Vamos criar três threads que rodem esse código, todas adicionando as mensagens na mesma ArrayList.
 * Em outras palavras, teremos threads compartilhando e acessando um mesmo objeto: é aqui que mora o perigo.
 * <p>
 * Modificar o método {@link ProduzMensagens#run()} para sincronizar o ArrayList
 */
public class RegistroDeMensagens {

    public static void main(String[] args) throws InterruptedException {
        Collection<String> mensagens = new ArrayList<String>();

        Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
        Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
        Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));

        t1.start();
        t2.start();
        t3.start();

        // faz com que a thread que roda o main aguarde o fim dessas
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Threads produtoras de mensagens finalizadas!");

        // verifica se todas as mensagens foram guardadas
        for (int i = 0; i < 15000; i++) {
            if (!mensagens.contains("Mensagem " + i)) {
                //System.out.println("não encontrei a mensagem: " + i);
                //System.out.println("Tamanho da lista: " + mensagens.size());
                throw new IllegalStateException("não encontrei a mensagem: " + i);
            }
        }

        // verifica se alguma mensagem ficou nula
        if (mensagens.contains(null)) {
            throw new IllegalStateException("não devia ter null aqui dentro!");
        }

        System.out.println("Tamanho da lista: " + mensagens.size());
        System.out.println("Fim da execucao com sucesso");
    }
}