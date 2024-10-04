import java.util.ArrayList;

// Classe Pessoa
public class Pessoa {
    // Atributos
    public String nome;
    public String cpf;
    public int idade;

    // Métodos

    // Método sem retorno
    public void cadastrar() {
        // Lógica de cadastrar
        System.out.println("Cadastrar" + this.cpf);
    }

    // Método com retorno e argumentos
    public boolean cpfValido(String cpf) {
        // Retorna
        return true;
    }

    // Métodos estáticos
    public static void metodoEstatico() {
        System.out.println("Estatico");
    }
}
