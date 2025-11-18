
public class Transacao {

    public double valor;
    public String localizacao;
    public boolean historicoBom;
    public String dispositivo;

    public Transacao(double v, String l, boolean h, String d) {
        valor = v;
        localizacao = l;
        historicoBom = h;
        dispositivo = d;
    }
}
