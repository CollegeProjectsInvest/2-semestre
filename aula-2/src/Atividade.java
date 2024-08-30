import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        // 2)
        Scanner input = new Scanner(System.in); // objeto

        System.out.println("Digite seu nome: ");
        String nome = input.next(); // captura primeira String

        System.out.println("Digite seu email: ");
        String email = input.next();

        System.out.println(
                "Olá " + nome + "! Seu e-mail " + email + " foi cadastrado"
        );
    }
}
