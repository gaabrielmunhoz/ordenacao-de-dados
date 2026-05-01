package EstudosSobreArray.Exercicio10;

// Exercício 10 — Normalização de strings
// Modifique um array para:
//  * Todas as strings ficarem em minúsculo
//  * Remover espaços extras
//  👉 Use:
//      * toLowerCase()
//      * trim();

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
                " O Pequeno Príncipe",
                "Crepusculo ",
                "Jogos Vorazes"
        };

        for (int i = 0; i < lista.length; i++){
            lista[i] = lista[i].trim().toLowerCase();
        }

        for (String i : lista){
            System.out.println(i);
        }
    }
}
