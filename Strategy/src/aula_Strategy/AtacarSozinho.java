package aula_Strategy;

public class AtacarSozinho implements Estrategia {

    @Override
    public void atacar() {
        plantarEvidenciasFalsas();
        soltarBombas();
        derrubarGoverno();
    }

    private void plantarEvidenciasFalsas() {
        System.out.println("Evidências falsas 1 plantadas...");
        System.out.println("Evidências falsas 2 plantadas...");
    }

    private void soltarBombas() {
        System.out.println("Soltar bombas...");
    }

    private void derrubarGoverno() {
        System.out.println("Derrubar o governo...");
    }

    @Override
    public void concluir() {
        estabelecerGovernoAmigo();
    }

    private void estabelecerGovernoAmigo() {
        System.out.println("Estabelecer governo amigo");
    }
}
