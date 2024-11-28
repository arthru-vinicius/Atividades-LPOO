package Polimorfismo.Qs5;

public class CirculoRedimensionavel extends Circulo implements Redimensionavel {

 public CirculoRedimensionavel(double raio) {
     super(raio);
 }

 @Override
 public void redimensionar(int percentual) {
     raio *= percentual / 100.0;
 }

 @Override
 public String toString() {
     return "CirculoRedimensionavel[raio=" + raio + "]";
 }
}
