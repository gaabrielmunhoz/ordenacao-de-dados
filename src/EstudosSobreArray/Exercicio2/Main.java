package EstudosSobreArray.Exercicio2;

// Exercício 2 — Acesso e alteração
// Dado um array:
// Mostre o primeiro e o último elemento
// Substitua o nome do livro da posição 5 por outro
// Imprima novamente o array
//👉 Objetivo: manipulação direta por índice.;


public class Main {

    public static void main(String[] args) {
        String [] livros = {
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

        System.out.println("\nLista de livros:\n");
        int contagem = 1;
        for (String livro : livros){
            System.out.println(contagem + "- " + livro);
            contagem++;
        }

        System.out.println("\nPrimeiro elemento: " + livros[0]);
        System.out.println("\nÚltimo elemento: " + livros[livros.length -1]);
        String posicao5 = livros[4];
        livros[4] = "HeartStopper";
        System.out.println("\nLivro \"" + posicao5 + "\" na posição 5 alterado para \"" + livros[4] + "\".");

        System.out.println("\nLista de livros atualizada:\n");
        contagem = 1;
        for (String livro : livros){
            System.out.println(contagem + "- " + livro);
            contagem++;
        }

    }
}
