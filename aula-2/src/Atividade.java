import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        // 2)
//        Scanner input = new Scanner(System.in); // objeto
//
//        System.out.println("Digite seu nome: ");
//        String nome = input.next(); // captura primeira String
//
//        System.out.println("Digite seu email: ");
//        String email = input.next();
//
//        System.out.println(
//                "Olá " + nome + "! Seu e-mail " + email + " foi cadastrado"
//        );

        // 6
        /*
        // Pegar duas senhas pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Primeira senha
        System.out.println("Digite uma senha:");
        String senha1 = scanner.next();

        // Segunda senha
        System.out.println("Digite outra senha:");
        String senha2 = scanner.next();

        // Comparando senhas
        boolean saoIguais = senha1.equals(senha2);

        System.out.println("Senhas são iguais? " + saoIguais);
        */

        // 7
        Scanner scanner = new Scanner(System.in);

        // Valores 1
        System.out.println("Email:");
        String email1 = scanner.next();

        System.out.println("Senha:");
        String senha1 = scanner.next();

        // Valores 2
        System.out.println("Email novamente: ");
        String email2 = scanner.next();

        System.out.println("Senha novamente");
        String senha2 = scanner.next();

//        boolean emailsIguais = email1.equals(email2);
//        boolean senhaiguais = senha1.equals(senha2);

        boolean dadosIguais = email1.equals(email2) && senha1.equals(senha2);

        System.out.println("Dados estão iguais: " + dadosIguais);
    }
}
