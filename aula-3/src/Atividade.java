import java.util.Random;
import java.util.Scanner;
//import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        // 5
//        Scanner scanner = new Scanner(System.in);
//
//        int totalNotas = 0;
//
//        for (int i = 1; i < 5; i++) {
//            System.out.println("Digite " + i + "º nota:");
//            int nota = scanner.nextInt();
//
//            if (nota >= 0 && nota <= 10) {
//                totalNotas += nota;
//            } else {
//                System.out.println("Valor inválido.");
//                i--;
//            }
//        }
//
//        int media = totalNotas / 4;
//        System.out.println("Média: " + media);

        // 7
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int numeroAleatorio = random.nextInt(101);
//
//        int tentativas = 0;
//
//        while (true) {
//            System.out.println("Adivinhe o número: ");
//            int tentativa = scanner.nextInt();
//
//            tentativas++;
//
//            if (tentativas == 5) {
//                System.out.println("Perdeu!");
//                System.out.println("Tentativas excedidas!");
//                break;
//            }
//
//            if (tentativa == numeroAleatorio) {
//                System.out.println("Ganhou!!");
//                break;
//            } else if (tentativa < numeroAleatorio) {
//                System.out.println("O número é maior.");
//            } else {
//                System.out.println("O número é menor.");
//            }
//        }
//
//        System.out.println("Tentativas: " + tentativas);


        // 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número:");
//        int numero = scanner.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("Número par");
//        } else {
//            System.out.println("Número ímpar");
//        }

        // 3
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite uma nota:");
//        int nota = scanner.nextInt();
//
//        if (nota >= 7 && nota <= 10) {
//            System.out.println("Aprovado!");
//        } else if (nota >= 4 && nota < 7) {
//            System.out.println("Recuperação!");
//        } else if (nota >= 0 && nota < 4) {
//            System.out.println("Reprovado");
//        } else {
//            System.out.println("Nota deve ser entre 0 à 10");
//        }
    }
}
