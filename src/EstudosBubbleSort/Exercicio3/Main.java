package EstudosBubbleSort.Exercicio3;

//  Exercício 3 — Contar trocas
//  Crie:
//  int trocas = 0;
//  Sempre que fizer swap:
//  trocas++;
//  👉 Compare:
//  * quantas comparações
//  * quantas trocas
//  👉 Insight: nem toda comparação vira troca;

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
                "Dom Casmurro",
                "1984",
                "O Hobbit",
                "A Revolução dos Bichos",
                "Harry Potter",
                "O Senhor dos Aneis",
                "Percy Jackson",
                "O Pequeno Príncipe",
                "Crepusculo",
                "Jogos Vorazes"
        };

        bubbleSort(lista);
    }
}
