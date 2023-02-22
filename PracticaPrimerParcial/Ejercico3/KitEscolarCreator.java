package PracticaPrimerParcial.Ejercico3;


public class KitEscolarCreator extends CreatorKit{

    @Override
    public KitEscolar create() {
        KitEscolar kitEscolar = new KitEscolar();

		kitEscolar.setMochila(new Mochila(2, "L"));
		kitEscolar.setDeportivo(new Deportivo("S", "Amarillo", 3));
		kitEscolar.setCuaderno(new Cuaderno("Carpeta", 100));
        return kitEscolar;
    }
}
