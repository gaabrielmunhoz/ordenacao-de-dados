package EstudosSobreArray.Exercicio3;

// Exercício 3 — Busca simples
// Peça para o usuário digitar um nome de livro e:
// Verifique se ele existe no array
// Retorne a posição ou "não encontrado"
//👉 Dica: usar equals() (não use ==).

import java.util.Scanner;

public class Main {

    public static void imprimirLista(String[] livros){

        int contagem = 1;
        for (String livro : livros){
            System.out.println(contagem + "- " + livro);
            contagem++;
        }
    }

    public static void main(String[] args) {

        Scanner inserir = new Scanner(System.in);

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

        imprimirLista(livros);

        System.out.print("\nBuscar livro: ");
        String buscar = inserir.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < livros.length; i++){
            if (livros[i].equals(buscar)){
                System.out.println("Livro \"" + buscar + "\" encontrado na posição " + (i+1) + ".");
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Livro \"" + buscar + "\" não encontrado.");
        }

        inserir.close();
    }
}
