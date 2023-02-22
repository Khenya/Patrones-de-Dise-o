package PracticaPrimerParcial.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Traductor extends EspanolIngles{
    private List<EspanolIngles> translate = new ArrayList<>();
    private Context context;

    public Traductor(String messages) {
        context = new Context(messages);
        
        for(String palabra : messages.split(" ")){
            switch (palabra){
                case "Como":
                    translate.add(new Given());
                    break;
                case "Quiero":
                    translate.add(new When());
                    break;
                case "Para":
                    translate.add(new Then());
                    break;
                default:
                    translate.add(new OtraPalabra());
                    break;
            }
        }
    }

    public String traduccion(){
        for(EspanolIngles espanolIngles:translate){
            espanolIngles.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {
        
    }
}
