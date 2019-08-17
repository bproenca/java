package br.com.bcp.ab;

/**
 * Created by bcp on 24/03/17.
 */
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        //se mudar o sleep para 2000 vai dar erro
        try {
            Thread.sleep(0);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }

        synchronized (b) {
            try {
                System.out.println("Aguardando o b completar...");
                b.wait();
                //b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Total é igual a: " + b.total);
        }
    }
}