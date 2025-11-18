
public class VerificacaoValor extends Verificacao {

    protected boolean executar(Transacao t) {
        if (t.valor > 10000) {
            System.out.println("Valor suspeito");
            return false;
        }
        return true;
    }
}
