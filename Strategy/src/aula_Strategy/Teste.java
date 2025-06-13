package aula_Strategy;

public class Teste {
    public static void main(String[] args) {
        Inimigo ini = new Inimigo(2000, "EUA");
        ini.setNuclear(true);
        ini.setHasNoChance(false);

        System.out.println("Inimigo: " + ini.getNome());
        System.out.println("Quantidade de soldados: " + ini.getQuantidade());
        System.out.println();

        Guerra que = new Guerra(ini);
        que.definirEstrategia();
        que.declararGuerra();
        que.encerrarGuerra();
    }
}
