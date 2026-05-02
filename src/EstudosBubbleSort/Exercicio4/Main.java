package EstudosBubbleSort.Exercicio4;

//  Exercício 4 — Testar pior caso
//  Crie um array já em ordem invertida:
//  ["Z", "Y", "X", "W", ...]
//  👉 Rode o Bubble
//  Compare:
//  * número de trocas
//  * número de comparações
//  👉 Esse é o pior cenário do algoritmo

public class Main {
    public static String[] bubbleSort(String[] arr) {
        String[] copia = arr.clone();
        int n = copia.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (copia[j].compareTo(copia[j + 1]) > 0) {
                    String temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);

        return copia;
    }

    public static void main(String[] args) {

        String[] lista = {
                "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q",
                "P", "O", "N", "M", "L", "K", "J", "I", "H", "G",
                "F", "E", "D", "C", "B", "A"
        };

        bubbleSort(lista);
    }
}
