package Excecoes;

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        try {
            System.out.println(nome.charAt(numero));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        }
    }
}
