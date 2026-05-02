package EstudosBubbleSort.Exercicio2;

//  Exercício 2 — Contar comparações
//  Adicione um contador:
//  int comparacoes = 0;
//  E incremente dentro do if:
//  comparacoes++;
//  👉 No final, mostre:
//  Total de comparações: X
//  👉 Objetivo: entender custo do algoritmo;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static String[] bubbleSort(String[] arr) {
        String[] copia = arr.clone();
        int n = copia.length;

        int contador = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copia[j].compareTo(copia[j + 1]) > 0) {
                    String temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                    contador++;
                }
            }
        }
        System.out.print(contador);
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


        System.out.print("Total de comparações: ");
        bubbleSort(lista);
    }
}
