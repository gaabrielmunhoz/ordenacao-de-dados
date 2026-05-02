package EstudosBubbleSort.Exercicio6;

//  Agora adicione:
//  boolean trocou;
//  E faça o algoritmo parar se nenhuma troca acontecer.
//  👉 Compare com o exercício anterior
//  👉 Insight: Bubble pode melhorar MUITO com isso

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
                if (copia[j].compareTo(copia[j + 1]) > 0) {
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
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"
        };

        bubbleSort(lista);
    }
}
