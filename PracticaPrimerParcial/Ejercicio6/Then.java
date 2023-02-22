package PracticaPrimerParcial.Ejercicio6;

public class Then extends EspanolIngles{
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("Para")) {
            context.setOutput(context.getOutput() + "Then ");
            context.setInput(context.getInput().substring(4)); 
        }
    }
}
