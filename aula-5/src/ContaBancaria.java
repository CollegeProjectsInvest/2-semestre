import java.util.Random;

public class ContaBancaria {
    private double saldo;
    private String nomeTitular;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;

        // Gerar numero conta
        var random = new Random();
        this.numeroConta = "conta-" + random.nextInt(100000000);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void verificarSaldo() {
        System.out.println("-- Saldo --");
        System.out.println("Número conta: " + this.numeroConta);
        System.out.println("Titular da conta: " + this.nomeTitular);
        System.out.println("Seu saldo é R$" + this.saldo);
    }
}
