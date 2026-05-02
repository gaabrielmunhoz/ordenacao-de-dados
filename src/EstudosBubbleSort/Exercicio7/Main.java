package EstudosBubbleSort.Exercicio7;

//  🧠 Exercício 7 — Ignorar maiúsculas/minúsculas
//  Modifique o sort para usar:
//  compareToIgnoreCase()
//  👉 Veja diferença no resultado

public class Main {
    public static String[] bubbleSort(String[] arr) {
        String[] copia = arr.clone();
        int n = copia.length;
        int comparacoes = 0;
        int trocas = 0;

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

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);

        return copia;
    }

    public static void main(String[] args) {

        String[] lista = {
                "banana",
                "Abacaxi",
                "uva",
                "Laranja",
                "abacate",
                "Manga",
                "morango",
                "Kiwi",
                "cereja",
                "Pera",
                "pera",
                "Maçã",
                "maçã",
                "Melancia",
                "melancia"
        };

        bubbleSort(lista);
    }
}
