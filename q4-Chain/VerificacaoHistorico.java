
public class VerificacaoHistorico extends Verificacao {

    protected boolean executar(Transacao t) {
        if (!t.historicoBom) {
            System.out.println("Histórico ruim");
            return false;
        }
        return true;
    }
}
