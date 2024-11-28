package Polimorfismo.Qs5;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Teste Circulo:");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
        
        CirculoRedimensionavel circulo2 = new CirculoRedimensionavel(10.0);

        System.out.println("Teste Circulo Redimensionável:");
        System.out.println("Raio inicial: " + circulo2.raio);
        System.out.println("Área inicial: " + circulo2.getArea());
        System.out.println("Perímetro inicial: " + circulo2.getPerimetro());

        circulo2.redimensionar(50);
        System.out.println("\nApós redimensionar em 50%:");
        System.out.println("Raio: " + circulo2.raio);
        System.out.println("Área: " + circulo2.getArea());
        System.out.println("Perímetro: " + circulo2.getPerimetro());

        circulo2.redimensionar(200);
        System.out.println("\nApós redimensionar em 200%:");
        System.out.println("Raio: " + circulo2.raio);
        System.out.println("Área: " + circulo2.getArea());
        System.out.println("Perímetro: " + circulo2.getPerimetro());
    }
}
