package PracticaPrimerParcial.Ejercicio9;

public class Numeros1234 extends Abstract{
    @Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("1")) {
			context.setOutput(context.getOutput() + "I ");
		} else if (context.getInput().startsWith("2")) {
			context.setOutput(context.getOutput() + "II ");
		} else if (context.getInput().startsWith("3")) {
			context.setOutput(context.getOutput() + "III ");
		} else {
			context.setOutput(context.getOutput() + "IV ");
		}
		context.setInput(context.getInput().substring(1));
	}
}
