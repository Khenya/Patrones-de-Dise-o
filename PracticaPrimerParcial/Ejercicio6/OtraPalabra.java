package PracticaPrimerParcial.Ejercicio6;

public class OtraPalabra extends EspanolIngles{
  
@Override
  public void interpreter(Context context) {
    context.output=context.output+" "+context.input.split(" ",2)[0];
    String [] aux = context.input.split(" ", 2);
    if(aux.length>1){
        context.input=aux[1];
    }
  }
}
