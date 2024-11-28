package Polimorfismo.Qs2;

public class TesteObjetoGeometrico {
    public static void main(String[] args) {
        // Testando Circulo
        ObjetoGeometrico circulo = new Circulo(5.0);
        System.out.println(circulo);
        System.out.println("Área do círculo: " + circulo.getArea());
        System.out.println("Perímetro do círculo: " + circulo.getPerimetro());

        // Testando Retangulo
        ObjetoGeometrico retangulo = new Retangulo(4.0, 6.0);
        System.out.println(retangulo);
        System.out.println("Área do retângulo: " + retangulo.getArea());
        System.out.println("Perímetro do retângulo: " + retangulo.getPerimetro());
    }
}
