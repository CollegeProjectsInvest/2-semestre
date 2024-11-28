import java.util.ArrayList;

class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println(this.nome + " fazendo som....");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
}

interface ICliente {
    void cadastrar();
}

class ClienteVip implements ICliente {
    @Override
    public void cadastrar() {

    }
}

class ClienteDiamante implements ICliente {
    @Override
    public void cadastrar() {

    }
}

public class Main {
    public static void main(String[] args) {
        // Com Herança
        Animal cachorro = new Cachorro("Bilu");
        Animal gato = new Gato("Toto");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {
            animal.fazerSom();
        }

        // Com Interface
        ICliente clienteVip = new ClienteVip();
        ICliente clienteDiamante = new ClienteDiamante();
    }
}
