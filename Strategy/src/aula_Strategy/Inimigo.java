package aula_Strategy;

public class Inimigo {
    private int quantidade;
    private boolean nuclear;
    private boolean hasNoChance;
    private String nome;

    public Inimigo(int quantidade, String nome) {
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isNuclear() {
        return nuclear;
    }

    public void setNuclear(boolean nuclear) {
        this.nuclear = nuclear;
    }

    public boolean hasNoChance() {
        return hasNoChance;
    }

    public void setHasNoChance(boolean hasNoChance) {
        this.hasNoChance = hasNoChance;
    }
}
