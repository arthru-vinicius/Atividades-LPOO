package Polimorfismo.Qs1;

public class Retangulo extends Forma {
    protected double largura;
    protected double comprimento;

    public Retangulo() {
        this.largura = 1.0;
        this.comprimento = 1.0;
    }

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Retangulo(double largura, double comprimento, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double getArea() {
        return largura * comprimento;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + comprimento);
    }

    @Override
    public String toString() {
        return "Retangulo[" + super.toString() + ", largura=" + largura + ", comprimento=" + comprimento + "]";
    }
}
