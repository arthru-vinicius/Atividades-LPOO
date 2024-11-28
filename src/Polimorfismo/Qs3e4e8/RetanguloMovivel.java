package Polimorfismo.Qs3e4e8;

public class RetanguloMovivel implements Movivel {
    private PontoMovivel cantoSuperiorEsquerdo;
    private PontoMovivel cantoInferiorDireito;

    public RetanguloMovivel(int x1, int y1, int x2, int y2, int velocidadeX, int velocidadeY) {
        this.cantoSuperiorEsquerdo = new PontoMovivel(x1, y1, velocidadeX, velocidadeY);
        this.cantoInferiorDireito = new PontoMovivel(x2, y2, velocidadeX, velocidadeY);
    }

    @Override
    public void moverParaCima() {
        cantoSuperiorEsquerdo.moverParaCima();
        cantoInferiorDireito.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        cantoSuperiorEsquerdo.moverParaBaixo();
        cantoInferiorDireito.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        cantoSuperiorEsquerdo.moverParaEsquerda();
        cantoInferiorDireito.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        cantoSuperiorEsquerdo.moverParaDireita();
        cantoInferiorDireito.moverParaDireita();
    }

    @Override
    public String toString() {
        return "RetanguloMovivel[cantoSuperiorEsquerdo=" + cantoSuperiorEsquerdo + 
               ", cantoInferiorDireito=" + cantoInferiorDireito + "]";
    }
}
