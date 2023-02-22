package PracticaPrimerParcial.Ejercicio6;

public class Then extends EspanolIngles{
    @Override
    public void interpreter(Context context) {
        if (context.input.split(" ")[0].equals("Para")){
            context.output=context.output+" Then";
            String [] aux = context.input.split(" ", 2);
            context.input=aux[1];
        }
    }
}
