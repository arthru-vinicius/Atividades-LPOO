package Polimorfismo.Qs3e4e8;

public class TesteMovivel {
    public static void main(String[] args) {
    	
        // Questão 3
        PontoMovivel ponto3 = new PontoMovivel(0, 0, 5, 10);

        System.out.println("Posição inicial: " + ponto3);

        ponto3.moverParaCima();
        System.out.println("Depois de moverParaCima(): " + ponto3);

        ponto3.moverParaBaixo();
        System.out.println("Depois de moverParaBaixo(): " + ponto3);

        ponto3.moverParaEsquerda();
        System.out.println("Depois de moverParaEsquerda(): " + ponto3);

        ponto3.moverParaDireita();
        System.out.println("Depois de moverParaDireita(): " + ponto3);
        // Fim questão 3
        
        
        // Questão 4
        PontoMovivel ponto4 = new PontoMovivel(0, 0, 5, 10);
        System.out.println("Posição inicial do ponto: " + ponto4);

        ponto4.moverParaCima();
        System.out.println("Depois de moverParaCima(): " + ponto4);

        ponto4.moverParaBaixo();
        System.out.println("Depois de moverParaBaixo(): " + ponto4);

        ponto4.moverParaEsquerda();
        System.out.println("Depois de moverParaEsquerda(): " + ponto4);

        ponto4.moverParaDireita();
        System.out.println("Depois de moverParaDireita(): " + ponto4);

        CirculoMovivel circulo = new CirculoMovivel(0, 0, 5, 10, 15);
        System.out.println("\nPosição inicial do círculo: " + circulo);

        circulo.moverParaCima();
        System.out.println("Depois de moverParaCima(): " + circulo);

        circulo.moverParaBaixo();
        System.out.println("Depois de moverParaBaixo(): " + circulo);

        circulo.moverParaEsquerda();
        System.out.println("Depois de moverParaEsquerda(): " + circulo);

        circulo.moverParaDireita();
        System.out.println("Depois de moverParaDireita(): " + circulo);
        //Fim quesão 4
        
        // Questão 8
        Movivel ponto8 = new PontoMovivel(5, 6, 10, 15);
        System.out.println("Ponto inicial: " + ponto8);
        ponto8.moverParaEsquerda();
        System.out.println("Depois de moverParaEsquerda: " + ponto8);

        // Testando CirculoMovivel
        Movivel circulo8 = new CirculoMovivel(1, 2, 3, 4, 20);
        System.out.println("\nCírculo inicial: " + circulo8);
        circulo8.moverParaDireita();
        System.out.println("Depois de moverParaDireita: " + circulo8);

        // Testando RetanguloMovivel
        Movivel retangulo8 = new RetanguloMovivel(0, 0, 10, 20, 5, 10);
        System.out.println("\nRetângulo inicial: " + retangulo8);
        retangulo8.moverParaCima();
        System.out.println("Depois de moverParaCima: " + retangulo8);
        // Fim questão 8
    }
}
