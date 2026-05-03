package AtividadeFormativaSemana7;


/*

1- digitar nome de um livro
2- procurar livro na arvore binária
3- mostrar todos os livros que o BFS e o DFS percorreram até encontrar o livro desejado

*/

import java.util.Queue;
import java.util.LinkedList;

class DFS {
    public static void percorrerArvore(No no) {
        if (no == null) {
            return;
        }

        percorrerArvore(no.esquerda);
        percorrerArvore(no.direita);
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
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        No raiz = new No(livro1);
        raiz.esquerda = new No(livro2);
        raiz.direita = new No(livro3);

        imprimir(raiz);

    }

}
