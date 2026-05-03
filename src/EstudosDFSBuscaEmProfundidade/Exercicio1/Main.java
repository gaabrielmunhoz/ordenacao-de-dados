package EstudosDFSBuscaEmProfundidade.Exercicio1;

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

import java.util.*;

public class Main {

    public static void dfs(Map<String, List<String>> grafo, Set<String> visitado, String vertice) {

        visitado.add(vertice);
        System.out.println("Visitando: " + vertice);

        for (String vizinho : grafo.get(vertice)){
            if (!visitado.contains(vizinho)){
                dfs(grafo, visitado, vizinho);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> grafo = new HashMap<>();

        grafo.put("A", new ArrayList<>());
        grafo.put("B", new ArrayList<>());
        grafo.put("C", new ArrayList<>());
        grafo.put("D", new ArrayList<>());
        grafo.put("E", new ArrayList<>());
        grafo.put("F", new ArrayList<>());

        grafo.get("A").add("B");
        grafo.get("A").add("C");
        grafo.get("B").add("D");
        grafo.get("B").add("E");
        grafo.get("C").add("F");

        Set<String> visitado = new HashSet<>();
        dfs(grafo, visitado, "A");

    }

}
