import java.io.*;

public class Logger {
    private static Logger instance = null;
    private File file = new File("B:\\Patrones de diseño\\Logger\\text.txt");
    private FileWriter write;
    private PrintWriter line;
    String name = "";


    private Logger() throws IOException {
        System.out.println("Iniciar Registro");
        
        write = new FileWriter(file, true);
        line = new PrintWriter(write);
        line.println("Se INICIO EL REGISTRO");
    }
    private synchronized static void create() throws IOException {
        if (instance == null){
            instance = new Logger();
        }
    }
    public static Logger getInstance() throws IOException {
        if (instance == null){
            create();
        }
        return instance;
    }
    public synchronized void addRegister(String register) throws IOException {
        line.println(register);
    }
    public void finish() throws IOException {
        System.out.println("Registro Finalisado");
        line.close();
        write.close();
    }
}
