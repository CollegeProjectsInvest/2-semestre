import java.util.HashMap;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        // 5
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        while (true) {
            System.out.println("Lista Telefônica:\n" +
                    "[0] Sair\n" +
                    "[1] Adicionar\n" +
                    "[2] Remover\n" +
                    "[3] Buscar contato\n" +
                    "[4] Listar"
            );
            int opcao = scanner.nextInt();

            if (opcao == 0) break;
            else if (opcao == 1) {
                // Adicionar
                System.out.println("Digite o nome do contato:");
                String nomeContato = scanner.next();

                System.out.println("Digite o número do contato:");
                String numeroContato = scanner.next();

                agenda.put(nomeContato, numeroContato);
            } else if (opcao == 2) {
                // remover
                for (String chave : agenda.keySet()) {
                    System.out.println("["+ chave +"]: " + agenda.get(chave));
                }

                System.out.println("Digite o nome do contato para remover:");
                String nomeContato = scanner.next();

                agenda.remove(nomeContato);
                System.out.println("Contato removido!");
            } else if (opcao == 3) {
                // Buscar
                // 1º buscar pelo nome
                // 2º buscar pelo telefone
            } else if (opcao == 4) {
                // Listar
                for (String chave : agenda.keySet()) {
                    System.out.println("["+ chave +"]: " + agenda.get(chave));
                }
            }
        }
    }
}
