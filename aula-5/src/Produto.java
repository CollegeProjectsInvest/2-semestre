import java.util.Scanner;

public class Produto {
    public String nome;
    public String categoria;
    public double valor;
    public int quantidade;

    // Construtor: inicializar um objeto
    // Chamado quando cria um objeto
    public Produto(String nome, String categoria, double valor, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public static Produto cadastrar() {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Digite a categoria do produto:");
        String categoria = scanner.next();

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, categoria, valor, quantidade);

        return produto;
    }

    public void visualizarProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Valor: " + this.valor);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
