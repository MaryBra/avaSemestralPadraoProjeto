
public class VerificacaoLocalizacao extends Verificacao {

    protected boolean executar(Transacao t) {
        if (!t.localizacao.equals("BR")) {
            System.out.println("Localizacao suspeita");
            return false;
        }
        return true;
    }
}
