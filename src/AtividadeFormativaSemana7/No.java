package AtividadeFormativaSemana7;

public class No {
    Livro livro;
    No filhoEsquerdo;
    No filhoDireito;

    public No(Livro livro){
        this.livro = livro;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

}
