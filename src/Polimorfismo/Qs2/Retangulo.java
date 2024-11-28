package Polimorfismo.Qs2;

public class Retangulo implements ObjetoGeometrico {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
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
        return "Retangulo[largura=" + largura + ", comprimento=" + comprimento + "]";
    }
}
