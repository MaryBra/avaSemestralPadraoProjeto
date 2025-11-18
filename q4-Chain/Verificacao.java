
public abstract class Verificacao {

    protected Verificacao prox;

    public Verificacao definirProximo(Verificacao v) {
        prox = v;
        return v;
    }

    public boolean verificar(Transacao t) {
        if (!executar(t)) {
            return false;
        
        }if (prox == null) {
            return true;
        
        }return prox.verificar(t);
    }

    protected abstract boolean executar(Transacao t);
}
