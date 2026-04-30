package EstudosSobreArray.Exercicio1;

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

        System.out.println("Lista de livros:\n");
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("\nTamanho do Array: " + livros.length);
    }
}
