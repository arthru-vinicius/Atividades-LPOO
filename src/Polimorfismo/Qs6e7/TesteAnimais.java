package Polimorfismo.Qs6e7;

public class TesteAnimais {
    public static void main(String[] args) {
        // Testando Gato
        Animal gato = new Gato("Felix");
        System.out.print(gato.nome + " diz: ");
        gato.saudar();

        // Testando Cachorro
        Cachorro cachorro = new Cachorro("Rex");
        System.out.print(cachorro.nome + " diz: ");
        cachorro.saudar();

        // Testando saudação entre Cachorros
        Cachorro outroCachorro = new Cachorro("Buddy");
        System.out.print(cachorro.nome + " saúda " + outroCachorro.nome + ": ");
        cachorro.saudar(outroCachorro);

        // Testando CachorroGrande
        CachorroGrande cachorroGrande = new CachorroGrande("Max");
        System.out.print(cachorroGrande.nome + " diz: ");
        cachorroGrande.saudar();

        // Testando saudação entre CachorroGrande e Cachorro
        System.out.print(cachorroGrande.nome + " saúda " + outroCachorro.nome + ": ");
        cachorroGrande.saudar(outroCachorro);

        // Testando saudação entre Cachorros Grandes
        CachorroGrande outroCachorroGrande = new CachorroGrande("Thor");
        System.out.print(cachorroGrande.nome + " saúda " + outroCachorroGrande.nome + ": ");
        cachorroGrande.saudar(outroCachorroGrande);
    }
}
