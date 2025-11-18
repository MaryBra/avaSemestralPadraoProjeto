
public class Main {

    public static void main(String[] args) {
        Verificacao c = new VerificacaoValor();
        c.definirProximo(new VerificacaoLocalizacao()).definirProximo(new VerificacaoHistorico()).definirProximo(new VerificacaoDispositivo());
        Transacao t = new Transacao(5000, "BR", true, "APROVADO");
        System.out.println("Resultado: " + c.verificar(t));
    }
}
