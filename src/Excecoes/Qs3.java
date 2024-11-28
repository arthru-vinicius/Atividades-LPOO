package Excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o caminho do arquivo: ");
        String caminho = scanner.nextLine();
        
        File arquivo = new File(caminho);
        
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso.");
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Caminho inválido");
        }
    }
}
