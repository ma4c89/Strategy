package aula_Strategy;

public class Diplomacia implements Estrategia {

    @Override
    public void atacar() {
        recuarTropas();
        proporCooperacaoEconomica();
    }

    private void recuarTropas() {
        System.out.println("Todas as tropas recuando...");
    }

    private void proporCooperacaoEconomica() {
        System.out.println("Cooperação econômica proposta...");
    }

    @Override
    public void concluir() {
        desarmarInimigos();
    }

    private void desarmarInimigos() {
        System.out.println("Inimigos desarmados.");
    }
}
