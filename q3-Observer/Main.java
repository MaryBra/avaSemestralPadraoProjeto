
public class Main {

    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.adicionarObservador(new PainelControle());
        s.adicionarObservador(new ModuloAlertas());
        s.adicionarObservador(new Historico());
        s.setValor(30.5);
        s.setValor(31.2);
    }
}
