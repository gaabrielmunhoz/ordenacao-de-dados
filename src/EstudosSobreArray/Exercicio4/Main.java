package EstudosSobreArray.Exercicio4;

// Exercício 4 — Contagem com condição
// Conte quantos livros:
// -Têm mais de 10 caracteres
// -Começam com a letra "O"
//👉 Objetivo: trabalhar com length() e charAt().;

public class Main {
    public static void main(String[] args) {
        String[] livros = {
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

        int maisDe10 = 0;
        int letraO = 0;

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].length() > 10) maisDe10++;

            if (livros[i].charAt(0) == 'O')letraO++;
        }

        System.out.println("\nQuantidade de livros com mais de 10 caracteres: " + maisDe10);
        System.out.println("Quantidade de livros que começam com a letra \"O\": " + letraO);

    }
}
