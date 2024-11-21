package Exercicio1;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public void exibirInfos() {
        System.out.println("===");
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano publicação: " + this.anoPublicacao);
        System.out.println("Emprestado? " + this.emprestado);
        System.out.println("===");
    }

    // Get
    public boolean getEmprestado() {
        return this.emprestado;
    }
}
