package AtividadeFormativaSemana7;

public class Main {

    public static void imprimir(No no) {
        if (no == null){
            return;
        }

        System.out.println(no.livro.getTitulo());
        imprimir(no.filhoEsquerdo);
        imprimir(no.filhoDireito);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        No raiz = new No(livro1);
        raiz.filhoEsquerdo = new No(livro2);
        raiz.filhoDireito = new No(livro3);

        imprimir(raiz);

    }

}
