import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        // Objeto ou instância
//        Pessoa pessoa1 = new Pessoa();

//        boolean cpfValido = pessoa1.cpfValido("12391239123");
//        System.out.println(cpfValido);
//
//        Pessoa pessoa2 = new Pessoa();
//
//        pessoa2.cpf = "0000000000";
//        pessoa2.cadastrar();


        var scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            var produto = Produto.cadastrar();
            produtos.add(produto);

            System.out.println("Deseja sair? 0");
            int option = scanner.nextInt();
            if (option == 0) break;
        }

        for (Produto produto : produtos) {
            produto.visualizarProduto();
        }
    }
}