package Polimorfismo.Qs1;

public class Quadrado extends Retangulo {

    public Quadrado() {
        super(1.0, 1.0);
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        super(lado, lado, cor, preenchido);
    }

    public double getLado() {
        return largura;
    }

    public void setLado(double lado) {
        this.largura = lado;
        this.comprimento = lado;
    }

    @Override
    public void setLargura(double lado) {
        setLado(lado);
    }

    @Override
    public void setComprimento(double lado) {
        setLado(lado);
    }

    @Override
    public String toString() {
        return "Quadrado[" + super.toString() + "]";
    }
}
