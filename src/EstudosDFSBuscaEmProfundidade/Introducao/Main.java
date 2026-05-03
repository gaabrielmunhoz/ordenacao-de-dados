package EstudosDFSBuscaEmProfundidade.Introducao;

/*
Questao para o próximo exercício:
Dada a árvore:

        A
       / \
      B   C
     / \   \
    D   E   F

👉 Usando DFS (esquerda primeiro), qual é a ordem de visita?
<details> <summary>Resposta</summary>
A → B → D → E → C → F
</details>
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void dfs(List<List<Integer>> grafo, boolean[] visitado, int vertice) {

        visitado[vertice] = true;
        System.out.println("Visitando: " + vertice);

        for (int vizinho : grafo.get(vertice)){
            if (!visitado[vizinho]){
                dfs(grafo, visitado, vizinho);
            }
        }
    }

    public static void main(String[] args) {
        int quantidadeVertices = 5;
        List<List<Integer>> grafo = new ArrayList<>();

        for (int i = 0; i < quantidadeVertices; i++) {
            grafo.add(new ArrayList<>());
        }

        grafo.get(0).add(1);
        grafo.get(0).add(2);
        grafo.get(1).add(3);
        grafo.get(2).add(4);

        boolean[] visitado = new boolean[5];

        System.out.println(grafo);
        dfs(grafo, visitado, 0);

    }
}
