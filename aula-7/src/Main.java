class ClassePai {
    public String nome;
    public String idade;

    public ClassePai(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void metodoTeste() {
        System.out.println("Método Classe Pai");
    }
}

class ClasseFilha extends ClassePai {
    private String email;

    public ClasseFilha(String nome, String idade) {
        super(nome, idade); // Chama o construtor da classe pai
    }

    @Override
    public void metodoTeste() {
        super.metodoTeste(); // também você pode chamar tudo que a classe pai tem

        // Sobreescrevendo método da classe pai
        System.out.println("Método classe filha");
    }
}

class ClasseNeta extends ClasseFilha {
    public ClasseNeta(String nome, String idade) {
        super(nome, idade);
    }
}

public class Main {
    public static void main(String[] args) {
        var classeFilha = new ClasseFilha("Marcos", "20");
        classeFilha.metodoTeste();
    }
}
