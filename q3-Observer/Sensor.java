
import java.util.*;

public class Sensor {

    private List<Observador> obs = new ArrayList<>();
    private double valor;

    public void adicionarObservador(Observador o) {
        obs.add(o);
    }

    public void setValor(double v) {
        valor = v;
        notificar();
    }

    private void notificar() {
        for (Observador o : obs) {
            o.atualizar(valor);
    
        }}
}
