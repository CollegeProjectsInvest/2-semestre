import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome para criar sua conta no Banco:");
        String nome = scanner.nextLine();

        System.out.println("Digite se CPF: ");
        String cpf = scanner.nextLine();

        var cliente = new Cliente(nome, cpf);

        while (true) {
            System.out.println("Menu Banco\n" +
                    "[1] Conta Corrente\n" +
                    "[2] Conta Poupança\n" +
                    "[0] Sair");

            var opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Conta corrente");
                System.out.println("[1] Depositar\n" +
                        "[2] Sacar\n" +
                        "[3] Visualizar Saldo");

                var opcaoContaCorrente = scanner.nextInt();

                switch (opcaoContaCorrente) {
                    case 1:
                        System.out.println("Digite um valor: ");
                        var valorDeposito = scanner.nextDouble();
                        cliente.contaCorrente.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite um valor: ");
                        var valorSaque = scanner.nextDouble();
                        cliente.contaCorrente.sacar(valorSaque);
                        break;
                    case 3:
                        cliente.contaCorrente.visualizarSaldo();
                        break;
                }
            } else if (opcao == 2) {
                System.out.println("Conta poupança");
                System.out.println("[1] Depositar\n" +
                        "[2] Sacar\n" +
                        "[3] Visualizar Saldo");

                var opcaoContaCorrente = scanner.nextInt();

                switch (opcaoContaCorrente) {
                    case 1:
                        System.out.println("Digite um valor: ");
                        var valorDeposito = scanner.nextDouble();
                        cliente.contaPoupanca.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite um valor: ");
                        var valorSaque = scanner.nextDouble();
                        cliente.contaPoupanca.sacar(valorSaque);
                        break;
                    case 3:
                        cliente.contaPoupanca.visualizarSaldo();
                        break;
                }
            } else if (opcao == 0) {
                System.out.println("Tchau brigado!");
                break;
            }
        }
    }
}
