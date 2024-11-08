import java.util.Random;

public class ContaBancaria {
    private double saldo;
    private int numeroConta;

    public ContaBancaria() {
        this.saldo = 0;

        Random random = new Random();
        this.numeroConta = random.nextInt(0, 9999999);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void visualizarSaldo() {
        System.out.println("== Nº" + this.numeroConta + " ==");
        System.out.println("Seu saldo: R$" + this.saldo);
    }
}
