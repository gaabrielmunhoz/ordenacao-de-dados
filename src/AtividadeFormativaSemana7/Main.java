package AtividadeFormativaSemana7;


/*

1- digitar nome de um livro
2- procurar livro na arvore binária
3- mostrar todos os livros que o BFS e o DFS percorreram até encontrar o livro desejado

*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class DFS {
    public static boolean buscaDFS(No no, String tituloBuscado) {
        if (no == null) {
            return false;
        }

        System.out.println("DFS passou por: " + no.livro.getTitulo());

        if (no.livro.getTitulo().equalsIgnoreCase(tituloBuscado)){
            return true;
        }

        if (buscaDFS(no.esquerda, tituloBuscado)){
            return true;
        }

        if (buscaDFS(no.direita, tituloBuscado)){
            return true;
        }

        return false;
    }
}

class BFS {
    public static boolean buscaBFS(No raiz, String tituloBuscado) {
        if (raiz == null) {
            return false;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No no = fila.poll();

            System.out.println("BFS passou por: " + no.livro.getTitulo());

            if (no.livro.getTitulo().equalsIgnoreCase(tituloBuscado)){
                return true;
            }

            if (no.esquerda != null) {
                fila.add(no.esquerda);
            }
            if (no.direita != null) {
                fila.add(no.direita);
            }
        }
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro4 = new Livro("Iracema", "José de Alencar", 1865);
        Livro livro5 = new Livro("Senhora", "José de Alencar", 1875);
        Livro livro6 = new Livro("O Cortiço", "Aluísio Azevedo", 1890);
        Livro livro7 = new Livro("Capitães da Areia", "Jorge Amado", 1937);
        Livro livro8 = new Livro("A Hora da Estrela", "Clarice Lispector", 1977);
        Livro livro9 = new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956);

        No raiz = new No(livro1);

        raiz.esquerda = new No(livro2);
        raiz.direita = new No(livro3);

        raiz.esquerda.esquerda = new No(livro4);
        raiz.esquerda.direita = new No(livro5);

        raiz.direita.esquerda = new No(livro6);
        raiz.direita.direita = new No(livro7);

        raiz.esquerda.esquerda.esquerda = new No(livro8);
        raiz.esquerda.esquerda.direita = new No(livro9);

        System.out.print("Buscar livro: ");
        String buscar = scanner.nextLine();
        buscar = buscar.trim();
        System.out.println();

        System.out.println("Busca por DFS:");
        long inicioDFS = System.currentTimeMillis();

        boolean encontrouDFS = DFS.buscaDFS(raiz, buscar);

        long fimDFS = System.currentTimeMillis();
        long tempoDFS = fimDFS - inicioDFS;

        if (encontrouDFS) {
            System.out.println("\nLivro \"" + buscar + "\" encontrado.");
            System.out.println("Tempo que o DFS levou: " + tempoDFS + " ms.\n");
        } else {
            System.out.println("\nLivro \"" + buscar + "\" não encontrado.\n");
        }

        System.out.println("Busca por BFS:");
        long inicioBFS = System.currentTimeMillis();

        boolean encontrouBFS = BFS.buscaBFS(raiz, buscar);

        long fimBFS = System.currentTimeMillis();
        long tempoBFS = fimBFS - inicioBFS;

        if (encontrouBFS) {
            System.out.println("\nLivro \"" + buscar + "\" encontrado.");
            System.out.println("Tempo que o BFS levou: " + tempoBFS + " ms.\n");
        } else {
            System.out.println("\nLivro \"" + buscar + "\" não encontrado.");
        }

    }

}
