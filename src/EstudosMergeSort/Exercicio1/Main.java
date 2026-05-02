package EstudosMergeSort.Exercicio1;

//  🔹 1. Teste com tamanhos diferentes
//  1.000
//  10.000
//  50.000

import java.util.Random;

public class Main {

    public static void mergeSort(int[] array) {

        if (array.length <= 1) return;

        int meio = array.length / 2;

        int[] esquerda = new int[meio];
        int[] direita = new int[array.length - meio];

        // copiando dados
        for (int i = 0; i < meio; i++) {
            esquerda[i] = array[i];
        }

        for (int i = meio; i < array.length; i++) {
            direita[i - meio] = array[i];
        }

        // recursão
        mergeSort(esquerda);
        mergeSort(direita);

        // junção
        merge(array, esquerda, direita);

    }

    private static void merge(int[] array, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                array[k++] = esquerda[i++];
            } else {
                array[k++] = direita[j++];
            }
        }

        // resto da esquerda
        while (i < esquerda.length) {
            array[k++] = esquerda[i++];
        }

        // resto da direita
        while (j < direita.length) {
            array[k++] = direita[j++];
        }
    }

    public static int[] gerarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100000); // números de 0 a 99.999
        }

        return array;
    }

    public static void testar(int[] lista){

        long inicio = System.currentTimeMillis();
        mergeSort(lista);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo para " + lista.length + ": " + (fim - inicio) + " ms.");
    }

    public static void main(String[] args) {

        int[] lista1 = gerarArrayAleatorio(1000);
        int[] lista2 = gerarArrayAleatorio(10000);
        int[] lista3 = gerarArrayAleatorio(50000);

        testar(lista1);
        testar(lista2);
        testar(lista3);

    }
}
