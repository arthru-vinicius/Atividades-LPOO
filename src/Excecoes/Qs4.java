package Excecoes;

import java.util.Scanner;

class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String mensagem) {
        super(mensagem);
    }
}

class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
    
    public void setLado1(double lado1) throws DimensoesInvalidasException {
        if (!ehTrianguloValido(lado1, this.lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para o lado 1");
        }
        this.lado1 = lado1;
    }
    
    public void setLado2(double lado2) throws DimensoesInvalidasException {
        if (!ehTrianguloValido(this.lado1, lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para o lado 2");
        }
        this.lado2 = lado2;
    }
    
    public void setLado3(double lado3) throws DimensoesInvalidasException {
        if (!ehTrianguloValido(this.lado1, this.lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para o lado 3");
        }
        this.lado3 = lado3;
    }
    
    private boolean ehTrianguloValido(double lado1, double lado2, double lado3) {
        return lado1 > Math.abs(lado2 - lado3) && lado1 < (lado2 + lado3)
            && lado2 > Math.abs(lado1 - lado3) && lado2 < (lado1 + lado3)
            && lado3 > Math.abs(lado1 - lado2) && lado3 < (lado1 + lado2);
    }
}

public class Qs4 {
    public static void main(String[] args) {
        try {
            Triangulo triangulo = new Triangulo(3, 4, 5);
            
            triangulo.setLado1(10);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro lado do triângulo: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Digite o segundo lado do triângulo: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Digite o terceiro lado do triângulo: ");
            double lado3 = scanner.nextDouble();
            
            Triangulo trianguloUsuario = new Triangulo(lado1, lado2, lado3);
            System.out.println("Triângulo criado com os lados informados.");
            
        } catch (DimensoesInvalidasException e) {
            System.out.println(e.getMessage());
        }
    }
}
