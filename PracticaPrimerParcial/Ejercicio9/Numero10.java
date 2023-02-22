package PracticaPrimerParcial.Ejercicio9;

public class Numero10 extends Abstract{
    @Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("10")) {
			context.setOutput(context.getOutput() + "X ");
			context.setInput(context.getInput().substring(2));
		}
	}
}
