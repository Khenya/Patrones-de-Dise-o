package PracticaPrimerParcial.Ejercicio9;

import java.util.ArrayList;

public class NumerosRomanos {

    private ArrayList<Abstract> parseTree = new ArrayList<Abstract>();
    private Context context;

    public NumerosRomanos(String numero) {
        context= new Context(numero.replace(" ",""));
        for (String token : numero.split(" ")) {
            int number = Integer.parseInt(token);

            if (number < 5){
                parseTree.add(new Numeros1234());
            } else  if (number == 5){
                parseTree.add(new Numero5());
            } else  if (number > 5 && number < 10){
                parseTree.add(new Numeros6789());
            } else {
                parseTree.add(new Numero10());
            } 
        }
    }

    public String getOutput() {
		for (Abstract expression : parseTree) {
			expression.interpreter(context);
		}
		return context.getOutput();
	}
}
