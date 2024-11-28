package Polimorfismo.Qs6e7;

public class Cachorro extends Animal {

 public Cachorro(String nome) {
     super(nome);
 }

 @Override
 public void saudar() {
     System.out.println("Au");
 }

 public void saudar(Cachorro outroCachorro) {
     System.out.println("Auuuuu");
 }
}
