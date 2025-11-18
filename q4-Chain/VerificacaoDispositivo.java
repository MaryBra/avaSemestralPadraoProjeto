
public class VerificacaoDispositivo extends Verificacao {

    protected boolean executar(Transacao t) {
        if (!t.dispositivo.equals("APROVADO")) {
            System.out.println("Dispositivo suspeito");
            return false;
        }
        return true;
    }
}
