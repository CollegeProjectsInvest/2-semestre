package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1Main {
    public static void main(String[] args) {
        // Biblioteca:
        ArrayList<Livro> livros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Criar um livro\n" +
                    "[2] Listar Livros\n" +
                    "[3] Emprestar Livro\n" +
                    "[4] Devolver Livro\n" +
                    "[0] Sair"
            );
            int opcao = scanner.nextInt();
            scanner.nextLine(); // BUG Scanner

            if (opcao == 1) {
                // Criar Livro
                System.out.println("Título: ");
                String titulo = scanner.nextLine();

                System.out.println("Autor:");
                String autor = scanner.nextLine();

                System.out.println("Ano publicação:");
                int anoPublicacao = scanner.nextInt();

                var livro = new Livro(titulo, autor, anoPublicacao);

                livros.add(livro);
            } else if (opcao == 2) {
                // Listar livros
                for (Livro livro : livros) {
                    livro.exibirInfos();
                }
            } else if (opcao == 3) {
                // Emprestar livro
                for (Livro livro : livros) {
                    livro.exibirInfos();

                    System.out.println("Deseja emprestar esse livro? [S/N]");
                    String emprestarTitulo = scanner.nextLine();

                    if (emprestarTitulo.equalsIgnoreCase("S")) {
                        livro.emprestar();
                    }
                }
            } else if (opcao == 4) {
                // Devolver Livro
                for (Livro livro : livros) {
                    if (livro.getEmprestado()) {
                        livro.exibirInfos();

                        System.out.println("Deseja devolver esse livro? [S/N]");
                        String devolverTitulo = scanner.nextLine();

                        if (devolverTitulo.equalsIgnoreCase("S")) {
                            livro.devolver();
                        }
                    }
                }
            } else if (opcao == 0) {
                System.out.println("Volte sempre....");
                break;
            }
        }
    }
}
