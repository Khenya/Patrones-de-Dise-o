package PracticaPrimerParcial.Ejercico3;

public class KitEscolarCreator extends CreatorKit{

    @Override
    public KitEscolar create() {
        KitEscolar kitEscolar = new KitEscolar();

        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(4);
        mochila.setTamano("M");
        
        kitEscolar.setMochila(mochila);

        Deportivo deportivo = new Deportivo();
        deportivo.setTalla("M");
        deportivo.setColor("rosa");
        deportivo.setNumeroDePrendas(3);

        kitEscolar.setDeportivo(deportivo);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Carpeta");
        cuaderno.setHojas(100);

        kitEscolar.setCuaderno(cuaderno);
        return kitEscolar;
    }
}
