package PracticaPrimerParcial.Ejercicio6;

public class Then extends EspanolIngles{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("para")) {
            context.output = context.output + "Then " ;
            context.input= context.input.substring(5); 
        }
    }
}
