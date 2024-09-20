import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array: tamanho fixo
        /*
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 22;
        numeros[2] = 5;
        numeros[3] = 11; // Erro: Tamanho ultrapassa

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        */

        // já passando valores
        /*
        String[] nomes = {"Marcos", "João"};

        nomes[0] = "Maria";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);

        nomes[2] = "Felipe"; // Erro: ultrapassa
        */

        // ArrayList: dinâmica
        /*
        ArrayList<String> nomes = new ArrayList<>();

        // adiciona elementos
        nomes.add("Marcos");
        nomes.add("Maria");
        nomes.add("Felipe");

        // capturar dados
        System.out.println(nomes.get(0));

        // remover
        nomes.remove(0);
        nomes.remove(1);

//        nomes.clear();

        System.out.println(nomes.isEmpty());
        System.out.println(nomes.size());

        System.out.println(nomes);
        System.out.println("Tem o nome Marcos: " + nomes.contains("Marcos"));
        */

        /*
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma tarefa: ");
            String tarefa = scanner.next();

            tarefas.add(tarefa);
        }

        System.out.println(tarefas);
         */

        // HashMap: chave-valor
        /*
        HashMap<String, String> estrutura = new HashMap<>();

        // Adicionar
        estrutura.put("Marcos", "010230123");
        estrutura.put("Felipe", "12388123");

        System.out.println(estrutura.get("Marcos")); // retorna o valor da chave

        System.out.println(estrutura.size());

        System.out.println(estrutura.containsKey("João"));
        System.out.println(estrutura.containsValue("12388123"));

        estrutura.remove("Felipe");

//        estrutura.clear();

        System.out.println(estrutura);
        */

        // Loops
//
//        ArrayList<String> nomes = new ArrayList<>();
//
//        nomes.add("Marcos");
//        nomes.add("João");
//        nomes.add("João");
//        nomes.add("João");
//        nomes.add("João");
//        nomes.add("João");
//
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }
//
//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(0);
//        numeros.add(1);
//        numeros.add(10);
//        numeros.add(20);
//
//        for (int numero : numeros) {
//            System.out.println(numero);
//        }
    }
}
