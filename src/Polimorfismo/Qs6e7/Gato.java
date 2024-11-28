package Polimorfismo.Qs6e7;

public class Gato extends Animal {

 public Gato(String nome) {
     super(nome);
 }

 @Override
 public void saudar() {
     System.out.println("Miau");
 }
}
