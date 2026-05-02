package EstudosBubbleSort.Exercicio8;

//  🔥 Exercício 8 — Teste com 10.000 elementos
//  Use seu gerador de nomes
//  Compare:
//  * tempo antes do sort
//  * tempo depois
//  long inicio = System.currentTimeMillis();
//  //sort
//  long fim = System.currentTimeMillis();
//  👉 Você vai sentir o algoritmo ficando pesado

import java.util.Random;

public class Main {

    public static void gerarLista(String[] lista,String caracteres, Random random){

        for (int i = 0; i < lista.length; i++) {

            int tamanhoAleatorio = random.nextInt(20) + 1;
            StringBuilder sb = new StringBuilder(tamanhoAleatorio);

            // gerar até 20 caracteres aleatórios por item
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
            boolean trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (copia[j].compareToIgnoreCase(copia[j + 1]) > 0) {
                    String temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
        System.out.println("Tempo total: " + (fim-inicio) + " ms");

        return copia;
    }

    public static void main(String[] args) {

        int tamanhoDaLista = 10000;
        String[] lista = new String[tamanhoDaLista];
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        gerarLista(lista, caracteres, random);
        bubbleSort(lista);

    }
}
