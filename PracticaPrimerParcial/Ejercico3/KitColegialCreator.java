package PracticaPrimerParcial.Ejercico3;

public class KitColegialCreator extends CreatorKit{

    @Override
    public KitColegial create() {
        KitColegial kitColegial = new KitColegial();

        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setOs("Windows 10");

        kitColegial.setComputadora(computadora);


        Libros libros = new Libros();
        libros.setAutor("Juan Robles");
        libros.setTipo("Matematicas 1");

        kitColegial.setLibro(libros);


        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(2);
        mochila.setTamano("S");

        kitColegial.setMochila(mochila);

        return kitColegial;
    }
    
}
