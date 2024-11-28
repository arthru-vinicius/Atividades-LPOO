package Polimorfismo.Qs3e4e8;

public class CirculoMovivel implements Movivel {
 private int raio;
 private PontoMovivel centro;

 public CirculoMovivel(int x, int y, int velocidadeX, int velocidadeY, int raio) {
     this.raio = raio;
     this.centro = new PontoMovivel(x, y, velocidadeX, velocidadeY);
 }

 @Override
 public void moverParaCima() {
     centro.moverParaCima();
 }

 @Override
 public void moverParaBaixo() {
     centro.moverParaBaixo();
 }

 @Override
 public void moverParaEsquerda() {
     centro.moverParaEsquerda();
 }

 @Override
 public void moverParaDireita() {
     centro.moverParaDireita();
 }

 @Override
 public String toString() {
     return "Centro=" + centro.toString() + ", raio=" + raio;
 }
}
