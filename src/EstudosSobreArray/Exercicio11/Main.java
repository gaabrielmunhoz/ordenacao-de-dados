package EstudosSobreArray.Exercicio11;

// Exercício 11 — Gerador + análise
//  Use o código que você já tem (gerador aleatório) e:
//  * Gere 10.000 nomes
//  * Conte quantos têm mais de 15 caracteres
//  * Conte quantos começam com vogal
//  👉 Aqui você começa a trabalhar com volume real de dados.;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanhoDaLista = 10000;

        String[] lista = new String[tamanhoDaLista];

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        // percorrer as 10.000 posições do array
        for (int i = 0; i < lista.length; i++) {

            int tamanhoAleatorio = random.nextInt(20) + 1;
            StringBuilder sb = new StringBuilder(tamanhoAleatorio);

            // gerar até 20 caracteres aleatórios por item
            for (int j = 0; j < tamanhoAleatorio; j++) {
                int indiceAleatorio = random.nextInt(caracteres.length());
                sb.append(caracteres.charAt(indiceAleatorio));
            }

            lista[i] = sb.toString();
        }

        // contar quantos tem mais de 15 caracteres e quantos começam com vogais
        int maiorQue15 = 0;
        String vogais = "aeiou";
        int iniciaComVogal = 0;

        for (int i = 0; i < lista.length; i++){
            if (lista[i].length() > 15){
                maiorQue15++;
            }
            if (vogais.indexOf(lista[i].trim().toLowerCase().charAt(0)) != -1){
                iniciaComVogal++;
            }
        }

        System.out.println("Quantidade itens com mais de 15 caracteres: " + maiorQue15);
        System.out.println("Quantidade de itens que iniciam com alguma vogal: " + iniciaComVogal);

    }
}
