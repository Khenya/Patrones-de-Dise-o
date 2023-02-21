package PracticaPrimerParcial.Ejercicio6;

public class When extends EspanolIngles {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("quiero")) {
            context.output = context.output + "When " ;
            context.input= context.input.substring(5); 
        }
    }
}
