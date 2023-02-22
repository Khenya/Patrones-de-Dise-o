package PracticaPrimerParcial.Ejercicio6;

public class OtraPalabra extends EspanolIngles{
    private String palabra;
    
    @Override
    public void interpreter(Context context) {
		context.setOutput(context.getOutput() + palabra + " ");
		context.setInput(context.getInput().substring(palabra.length()));
	}
}
