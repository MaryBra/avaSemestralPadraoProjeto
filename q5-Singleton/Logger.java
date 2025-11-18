
public class Logger {

    private static volatile Logger instancia;

    private Logger() {
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            synchronized (Logger.class) {
                if (instancia == null) {
                    instancia = new Logger();
                }
            }
        }
        return instancia;
    }

    public void registrar(String msg) {
        System.out.println("[LOG] " + msg);
    }
}
