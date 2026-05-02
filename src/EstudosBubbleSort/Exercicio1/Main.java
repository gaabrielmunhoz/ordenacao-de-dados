package EstudosBubbleSort.Exercicio1;

//  Exercício 1 — Usar e comparar
//  * Crie um array com 10 livros (igual você já tem)
//  * Ordene usando bubbleSort
//  * Imprima:
//      * lista original
//      * lista ordenada
//  👉 Objetivo: ver o efeito real do algoritmo;

public class Main {
    public static String[] bubbleSort(String[] arr) {
        String[] copia = arr.clone();
        int n = copia.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copia[j].compareTo(copia[j + 1]) > 0) {
                    String temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }
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

        int contagem = 1;
        System.out.println("\nLista original:");
        for (String i : lista) {
            System.out.println(contagem + "- " + i);
            contagem++;
        }

        String[] ordenada = bubbleSort(lista);

        System.out.println("\nLista ordenada:");
        for (int i = 0; i < ordenada.length; i++){
            System.out.println((i+1) + "- " + ordenada[i]);
        }
    }
}
