package Polimorfismo.Qs1;

public class TesteFormas {
    public static void main(String[] args) {
        
        Forma f1 = new Circulo(5.5, "vermelho", false);
        System.out.println(f1);
        System.out.println(f1.getArea());
        System.out.println(f1.getPerimetro());
        System.out.println(f1.getCor());
        System.out.println(f1.isPreenchido());
        // System.out.println(f1.getRaio()); // Erro: getRaio não está disponível em Forma

        Circulo c1 = (Circulo) f1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetro());
        System.out.println(c1.getCor());
        System.out.println(c1.isPreenchido());
        System.out.println(c1.getRaio());

        // Forma f2 = new Forma(); // Erro: Não é possível instanciar classe abstrata

        Forma f3 = new Retangulo(1.0, 2.0, "vermelho", false);
        System.out.println(f3);
        System.out.println(f3.getArea());
        System.out.println(f3.getPerimetro());
        System.out.println(f3.getCor());
        // System.out.println(f3.getComprimento()); // Erro: getComprimento não está disponível em Forma

        Retangulo r1 = (Retangulo) f3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getCor());
        System.out.println(r1.getComprimento());

        Forma f4 = new Quadrado(6.6);
        System.out.println(f4);
        System.out.println(f4.getArea());
        System.out.println(f4.getCor());
        // System.out.println(f4.getLado()); // Erro: getLado não está disponível em Forma

        Retangulo r2 = (Retangulo) f4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getCor());
        // System.out.println(r2.getLado()); // Erro: getLado não está disponível em Retangulo
        System.out.println(r2.getComprimento());

        Quadrado q1 = (Quadrado) r2;
        System.out.println(q1);
        System.out.println(q1.getArea());
        System.out.println(q1.getCor());
        System.out.println(q1.getLado());
        System.out.println(q1.getComprimento());
    }
}
