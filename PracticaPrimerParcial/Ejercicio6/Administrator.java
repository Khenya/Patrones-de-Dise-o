package PracticaPrimerParcial.Ejercicio6;

public class Administrator extends EspanolIngles {
    @Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("administrador")) {
			context.setOutput(context.getOutput() + "administrator ");
			context.setInput(context.getInput().substring(13));
		}
	}
}
