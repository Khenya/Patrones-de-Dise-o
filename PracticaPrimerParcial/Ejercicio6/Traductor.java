package PracticaPrimerParcial.Ejercicio6;

import java.util.ArrayList;
import java.util.List;
public class Traductor {
    private List<EspanolIngles> translate = new ArrayList<EspanolIngles>();
    private Context context;
    public Traductor(String messages) {
        context = new Context(messages + " ");
        for(String token : messages.split(" ")){
            switch (token.toLowerCase()){
                case "como":
                    translate.add(new Given());
                    break;
                case "quiero":
                    translate.add(new When());
                    break;
                case "para":
                    translate.add(new Then());
                    break;
                default:
                    translate.add(new OtraPalabra());
                    break;
            }
        }


    }

    public String traduccion() {
        for (EspanolIngles espanolIngles : translate){
            espanolIngles.interpreter(context);
        }
        return context.output;
    }

}
