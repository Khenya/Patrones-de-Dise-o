package PracticaPrimerParcial.Ejercicio6;

public class OtraPalabra extends EspanolIngles{
    @Override
    public void interpreter(Context context) {
        String value=context.input.split(" ")[0];
        context.output = context.output + value+" " ;
        context.input = context.input.substring(value.length()+1);
    }
}
