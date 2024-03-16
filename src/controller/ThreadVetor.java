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
            // Se o valor numerico for par, percorre o vetor com for
            for (int i = 0; i < vetor.length; i++) {
                int elemento = vetor[i];
                // Faz algo com o elemento, neste caso, apenas acessa
            }
        } else {
            // Se o valor numerico for ímpar, percorre o vetor com foreach
            for (int elemento : vetor) {
                // Faz algo com o elemento, neste caso, apenas acessa
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTimeSeconds = (endTime - startTime) / 1000;
        System.out.println("Tempo para percorrer o vetor (segundos): " + elapsedTimeSeconds);
    }
}
