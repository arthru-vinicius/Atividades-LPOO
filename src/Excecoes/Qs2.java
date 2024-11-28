package Excecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades.add(scanner.nextInt());
        }
        
        System.out.print("Digite o número da posição para remover: ");
        int posicao = scanner.nextInt();
        
        try {
            idades.remove(posicao);
            System.out.println("Idade removida com sucesso.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        }
    }
}
