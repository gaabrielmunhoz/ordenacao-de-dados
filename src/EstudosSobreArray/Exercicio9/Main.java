package EstudosSobreArray.Exercicio9;

// Exercício 9 — Verificar se está ordenado
// Crie um metodo que verifica se o array está em ordem alfabética.
//👉 Esse exercício é MUITO importante para entender sorting.;

public class Main {
    public static void main(String[] args) {
        String[] lista = {
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

        boolean ordenado = true;

        for (int i = 0; i < lista.length -1; i++){
            if (lista[i].compareTo(lista[i+1]) > 0){
                ordenado = false;
                break;
            }
        }

        if (ordenado){
            System.out.println("Está em ordem alfabética.");
        } else {
            System.out.println("Não está em ordem alfabética.");
        }
    }
}
