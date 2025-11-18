
public class Main {

    public static void main(String[] args) {
        AnaliseRisco ar = new AnaliseRisco();
        ar.setEstrategia(new RiscoAgressivo());
        System.out.println(ar.executarCalculo(1000));
        ar.setEstrategia(new RiscoModerado());
        System.out.println(ar.executarCalculo(1000));
    }
}
