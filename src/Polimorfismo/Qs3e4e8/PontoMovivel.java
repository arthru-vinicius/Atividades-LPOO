package Polimorfismo.Qs3e4e8;

public class PontoMovivel implements Movivel {
 int x;
 int y;
 int velocidadeX;
 int velocidadeY;

 public PontoMovivel(int x, int y, int velocidadeX, int velocidadeY) {
     this.x = x;
     this.y = y;
     this.velocidadeX = velocidadeX;
     this.velocidadeY = velocidadeY;
 }

 @Override
 public void moverParaCima() {
     y -= velocidadeY;
 }

 @Override
 public void moverParaBaixo() {
     y += velocidadeY;
 }

 @Override
 public void moverParaEsquerda() {
     x -= velocidadeX;
 }

 @Override
 public void moverParaDireita() {
     x += velocidadeX;
 }

 @Override
 public String toString() {
     return "(" + x + ", " + y + ") velocidade=(" + velocidadeX + ", " + velocidadeY + ")";
 }
}
