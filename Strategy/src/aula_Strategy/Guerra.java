package aula_Strategy;

public class Guerra {
    private Inimigo inimigo;
    private Estrategia acao;

    public Guerra(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    public void definirEstrategia() {
        if (inimigo.getQuantidade() < 1000) {
            acao = new AliancaVizinha();
        } else if (inimigo.isNuclear()) {
            acao = new Diplomacia();
        } else if (inimigo.hasNoChance()) {
            acao = new AtacarSozinho();
        }
    }

    public void declararGuerra() {
        if (acao != null) {
            acao.atacar();
        }
    }

    public void encerrarGuerra() {
        if (acao != null) {
            acao.concluir();
        }
    }
}

