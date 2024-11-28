package Polimorfismo.Qs5;

public class Circulo implements ObjetoGeometrico {
 protected double raio;

 public Circulo(double raio) {
     this.raio = raio;
 }

 @Override
 public double getPerimetro() {
     return 2 * Math.PI * raio;
 }

 @Override
 public double getArea() {
     return Math.PI * raio * raio;
 }

 @Override
 public String toString() {
     return "Circulo[raio=" + raio + "]";
 }
}
