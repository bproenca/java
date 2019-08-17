package br.com.bcp.ab;

/**
 * Created by bcp on 24/03/17.
 */
public class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 200; i++) {
                total += i;
            }
            notify();
        }
        System.out.println("Fim ThreadB");
    }
}