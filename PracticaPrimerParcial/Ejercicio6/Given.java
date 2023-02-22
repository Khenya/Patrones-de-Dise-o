package PracticaPrimerParcial.Ejercicio6;

public class Given extends EspanolIngles {
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("Como")) {
            context.setOutput(context.getOutput() + "Given ");
            context.setInput(context.getInput().substring(4));
        }
    }
}
