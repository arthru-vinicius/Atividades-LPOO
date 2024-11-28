package Polimorfismo.Qs6e7;

public class CachorroGrande extends Cachorro {

 public CachorroGrande(String nome) {
     super(nome);
 }

 @Override
 public void saudar() {
     System.out.println("Auuuuu");
 }

 @Override
 public void saudar(Cachorro outroCachorro) {
     System.out.println("Auuuuuuuuu");
 }

 public void saudar(CachorroGrande outroCachorroGrande) {
     System.out.println("Auuuuuuuuuuuuuuu");
 }
}
