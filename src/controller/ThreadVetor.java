package controller;

public class ThreadVetor extends Thread {

    private int valorNumerico;
    private int[] vetor;

    public ThreadVetor(int valorNumerico, int[] vetor) {
        this.valorNumerico = valorNumerico;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        if (valorNumerico % 2 == 0) {
          
            for (int i = 0; i < vetor.length; i++) {
                int elemento = vetor[i];
            
            }
        } else {

            for (int elemento : vetor) {
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTimeSeconds = (endTime - startTime) / 1000;
        System.out.println("Tempo para percorrer o vetor (segundos): " + elapsedTimeSeconds);
    }
}
