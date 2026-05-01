package EstudosSobreArray.Exercicio7;

// Exercício 7 — Remover elemento (simulado)
// Remova um livro pelo nome:
// -Crie um novo array sem esse elemento
//👉 Importante: arrays têm tamanho fixo → você precisa recriar.;

public class Main {
    public static void main(String[] args) {
        String[] lista1 = {
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

        String remover = "A Revolução dos Bichos";

        int novoTamanho = 0;

        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i] != remover) {
                novoTamanho++;
            }
        }

        String[] lista2 = new String[novoTamanho];

        int indice = 0;
        for (int i = 0; i < lista1.length; i++){
            if (lista1[i] != remover){
                lista2[indice] = lista1[i];
                indice++;
            }
        }

        for (String i : lista2){
            System.out.println(i);
        }

    }
}
