package EstudosSobreArray.Exercicio5;

// Exercício 5 — Encontrar maior e menor
// Encontre:
// -O nome "maior" (ordem alfabética)
// -O nome "menor"
//👉 Dica: usar compareTo()
//👉 Isso já prepara para ordenação.;

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

        String maior = livros[0];
        String menor = livros[0];

        for (String titulo : livros) {
            if (titulo.compareTo(maior) > 0) {
                maior = titulo;
            }
            if (titulo.compareTo(menor) < 0) {
                menor = titulo;
            }
        }
        System.out.println("\nMaior: " + maior +"\nMenor: " + menor);
    }
}
