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
    public static boolean buscarLivro(No no, String tituloBuscado) {
        if (no == null) {
            return false;
        }

        System.out.println("DFS passou por: " + no.livro.getTitulo());

        if (no.livro.getTitulo().equalsIgnoreCase(tituloBuscado)){
            return true;
        }

        if (buscarLivro(no.esquerda, tituloBuscado)){
            return true;
        }

        if (buscarLivro(no.direita, tituloBuscado)){
            return true;
        }

        return false;
    }
}

class BFS {
    public static void percorrerArvore(No raiz) {
        if (raiz == null) {
            return;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No no = fila.poll();

            if (no.esquerda != null) {
                fila.add(no.esquerda);
            }
            if (no.direita != null) {
                fila.add(no.direita);
            }
        }
    }
}

public class Main {

    public static void imprimir(No no) {
        if (no == null){
            return;
        }

        System.out.println(no.livro.getTitulo());
        imprimir(no.esquerda);
        imprimir(no.direita);
    }

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

        boolean encontrou = DFS.buscarLivro(raiz, buscar);

        if (encontrou) {
            System.out.println("\nLivro \"" + buscar + "\" encontrado.");
        } else {
            System.out.println("\nLivro \"" + buscar + "\" não encontrado.");
        }

    }

}
