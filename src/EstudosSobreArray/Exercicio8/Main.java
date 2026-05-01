package EstudosSobreArray.Exercicio8;

// Exercício 8 — Inverter array
// Crie um metodo que:
// -Recebe um array
// -Retorna ele invertido
// Ex:
// [A, B, C] → [C, B, A];

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

        String[] listaInvertida = new String[lista.length];

        int indice = 0;
        for (int i = lista.length -1; i >= 0; i--){
            listaInvertida[indice] = lista[i];
            indice++;
        }

        System.out.println("\nLista original:");
        int contagem1 = 1;
        for (String i : lista){
            System.out.println(contagem1 + "- " + i);
            contagem1++;
        }

        System.out.println("\nLista invertida:");

        int contagem2 = 10;
        for (String i : listaInvertida){
            System.out.println(contagem2 + "- " + i);
            contagem2--;
        }
    }
}
