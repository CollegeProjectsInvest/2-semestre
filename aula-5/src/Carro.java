import java.util.ArrayList;

interface EntidadeJogo {
    void mover();
    void atacar();
}

class Jogador implements EntidadeJogo {
    @Override
    public void mover() {
    }

    @Override
    public void atacar() {

    }
}

class Inimigo implements EntidadeJogo {
    @Override
    public void mover() {

    }

    @Override
    public void atacar() {

    }
}

class Pessoa {

}

class PessoaFisica extends Pessoa {}

class PessoaJuridica extends Pessoa {}

class Main {
    public static void main(String[] args) {
        ArrayList<EntidadeJogo> entidadeJogos = new ArrayList<>();

        var jogador = new Jogador();
        var inimigo = new Inimigo();

        entidadeJogos.add(jogador);
        entidadeJogos.add(inimigo);

        for (EntidadeJogo entidade : entidadeJogos) {
            entidade.mover();
        }

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new PessoaFisica());
        pessoas.add(new PessoaJuridica());
    }
}
