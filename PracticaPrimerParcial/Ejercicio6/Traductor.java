package PracticaPrimerParcial.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Traductor {
    private List<EspanolIngles> translate = new ArrayList<EspanolIngles>();
    private Context context;

    public Traductor(String messages) {
        context = new Context(messages.replace(" ", ""));
        
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
                case "administrador":
				    translate.add(new Administrator());
				    break;
                default:
                    translate.add(new OtraPalabra());
                    break;
            }
        }
    }

    public String getOutput() {
		for (EspanolIngles espanolIngles : translate) {
			espanolIngles.interpreter(context);
		}
		return context.getOutput();
	}
}
