package EstudosSobreArray.Exercicio6;

// Exercício 6 — Cópia de array
// Crie:
// -Um novo array com os mesmos elementos
// -Sem usar .clone()
//👉 Objetivo: entender cópia manual.;

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

        System.out.println("\nLista original:");

        int contagem = 1;
        for (String livro : lista1){
            System.out.println(contagem + "- " + livro);
            contagem++;
        }

        System.out.println("\nCópia manual da lista original:");

        String[] lista2 = new String[lista1.length];

        for (int i = 0; i < lista1.length; i++){
            lista2[i] = lista1[i];
            System.out.println((i+1) + "- " + lista2[i]);
        }
    }
}
