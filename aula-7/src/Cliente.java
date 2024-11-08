public class Cliente {
    private String nome;
    private String cpf;

    public ContaCorrente contaCorrente;
    public ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.contaCorrente = new ContaCorrente();
        this.contaPoupanca = new ContaPoupanca();
    }
}
