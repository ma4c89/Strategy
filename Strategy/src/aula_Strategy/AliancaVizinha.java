package aula_Strategy;

public class AliancaVizinha implements Estrategia {

    @Override
    public void atacar() {
        vizinhoPeloNorte();
        atacarPeloSul();
    }

    private void vizinhoPeloNorte() {
        System.out.println("Vizinho pelo norte...");
    }

    private void atacarPeloSul() {
        System.out.println("Atacando pelo sul...");
    }

    @Override
    public void concluir() {
        dividirReconstrucao();
        dividirBeneficios();
    }

    private void dividirReconstrucao() {
        System.out.println("Dividir reconstrução...");
    }

    private void dividirBeneficios() {
        System.out.println("Dividir benefícios...");
    }
}
