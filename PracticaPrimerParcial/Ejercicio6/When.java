package PracticaPrimerParcial.Ejercicio6;

public class When extends EspanolIngles {
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("Quiero")) {
            context.setOutput(context.getOutput() + "When ");
            context.setInput(context.getInput().substring(6));
        }
    }
}
