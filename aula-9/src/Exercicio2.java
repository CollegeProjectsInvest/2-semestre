interface IForma {
    void calcularArea();
    void calcularPerimetro();
}

abstract class Forma implements IForma {
    protected double perimetro;
    protected double area;

    public void mostrarDados() {
        System.out.println("Area: " + this.area);
        System.out.println("Perimetro: " + this.perimetro);
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * Math.pow(this.raio, 2);
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.largura * this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.largura * 2 + this.altura * 2;
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        var circulo = new Circulo(10);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        circulo.mostrarDados();

        var retangulo = new Retangulo(5, 4);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.mostrarDados();
    }
}
