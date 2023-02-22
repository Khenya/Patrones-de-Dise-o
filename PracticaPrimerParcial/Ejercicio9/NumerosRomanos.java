package PracticaPrimerParcial.Ejercicio9;
import java.util.ArrayList;
public class NumerosRomanos {
    private ArrayList<Abstract> parseTree = new ArrayList<Abstract>();
    private Context context;
    public NumerosRomanos(String numero) {
        context= new Context(numero.replace(" ",""));
        for (String token : numero.split(" ")) {
            switch (token){
                case "1":
                    parseTree.add(new Roman1());
                    break;
                case "2":
                    parseTree.add(new Roman2());
                    break;
                case "3":
                    parseTree.add(new Roman3());
                    break;
                case "4":
                    parseTree.add(new Roman4());
                    break;
                case "5":
                    parseTree.add(new Roman5());
                    break;
                case "6":
                    parseTree.add(new Roman6());
                    break;
                case "7":
                    parseTree.add(new Roman7());
                    break;
                case "8":
                    parseTree.add(new Roman8());
                    break;
                case "9":
                    parseTree.add(new Roman9());
                    break;
                case "10":
                    parseTree.add(new Roman10());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
