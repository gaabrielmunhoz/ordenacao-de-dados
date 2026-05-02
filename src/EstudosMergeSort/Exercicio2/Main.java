package EstudosMergeSort.Exercicio2;

//  🔹 2. Compare com Bubble Sort
//  Usa seu código antigo e mede tempo
//  👉 Você vai ver a diferença real

import java.util.Random;
public class Main {
    static long comparacoesMerge = 0;
    static long movimentosMerge = 0;
    public static void gerarLista(String[] lista,String caracteres, Random random){
        for (int i = 0; i < lista.length; i++) {
            int tamanhoAleatorio = random.nextInt(20) + 1;
            StringBuilder sb = new StringBuilder(tamanhoAleatorio);
            for (int j = 0; j < tamanhoAleatorio; j++) {
                int indiceAleatorio = random.nextInt(caracteres.length());
                sb.append(caracteres.charAt(indiceAleatorio));
            }
            lista[i] = sb.toString();
        }
    }
    public static String[] bubbleSort(String[] arr) {
        String[] copia = arr.clone();
        int n = copia.length;
        long comparacoes = 0;
        long trocas = 0;
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (copia[j].compareToIgnoreCase(copia[j + 1]) > 0) {
                    String temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                    trocas++;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
        return copia;
    }
    public static void mergeSort(String[] array) {
        if (array.length <= 1) return;
        int meio = array.length / 2;
        String[] esquerda = new String[meio];
        String[] direita = new String[array.length - meio];
        for (int i = 0; i < meio; i++) {
            esquerda[i] = array[i];
        }
        for (int i = meio; i < array.length; i++) {
            direita[i - meio] = array[i];
        }
        mergeSort(esquerda);
        mergeSort(direita);
        merge(array, esquerda, direita);
    }
    private static void merge(String[] array, String[] esquerda, String[] direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda.length && j < direita.length) {
            comparacoesMerge++;
            if (esquerda[i].compareToIgnoreCase(direita[j]) <= 0) {
                array[k++] = esquerda[i++];
            } else {
                array[k++] = direita[j++];
            }
            movimentosMerge++;
        }
        while (i < esquerda.length) {
            array[k++] = esquerda[i++];
            movimentosMerge++;
        }
        while (j < direita.length) {
            array[k++] = direita[j++];
            movimentosMerge++;
        }
    }
    public static void testarMerge(String[] lista){
        comparacoesMerge = 0;
        movimentosMerge = 0;
        long inicio = System.currentTimeMillis();
        mergeSort(lista);
        long fim = System.currentTimeMillis();
        System.out.println("\nTamanho: " + lista.length);
        System.out.println("Comparações Merge: " + comparacoesMerge);
        System.out.println("Movimentos Merge: " + movimentosMerge);
        System.out.println("Tempo Merge: " + (fim - inicio) + " ms.");
    }
    public static void testarBubble(String[] lista){
        System.out.println("\nTamanho: " + lista.length);
        long inicio = System.currentTimeMillis();
        bubbleSort(lista);
        long fim = System.currentTimeMillis();
        long tempo = (fim - inicio);
        if (tempo >= 1000){
            tempo = (tempo/1000);
            System.out.println("Tempo: " + tempo + " s");
        } else {
            System.out.println("Tempo: " + (fim - inicio) + " ms");
        }
    }
    public static void main(String[] args) {
        String[] lista1 = new String[10000];
        String[] lista2 = new String[25000];
        String[] lista3 = new String[50000];
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        gerarLista(lista1, caracteres, random);
        gerarLista(lista2, caracteres, random);
        gerarLista(lista3, caracteres, random);
        System.out.println("\nUsando o Bubble Sort:");
        testarBubble(lista1);
        testarBubble(lista2);
        testarBubble(lista3);
        System.out.println("\nUsando o Merge Sort:");
        testarMerge(lista1);
        testarMerge(lista2);
        testarMerge(lista3);
    }
}
