class Cliente {
    private String nome = "Marcos";
    private String cpf;
    private int idade;

    // Get e Set
    public void showInfos() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        var cliente = new Cliente();
        cliente.showInfos();
    }
}
