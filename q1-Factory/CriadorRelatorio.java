
public abstract class CriadorRelatorio {

    public abstract Relatorio criarRelatorio();

    public void gerarRelatorio() {
        Relatorio r = criarRelatorio();
        r.gerar();
    }
}
