
public class AnaliseRisco {

    private CalculoRisco estrategia;

    public void setEstrategia(CalculoRisco e) {
        estrategia = e;
    }

    public double executarCalculo(double v) {
        return estrategia.calcular(v);
    }
}
