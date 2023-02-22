package PracticaPrimerParcial.Ejercico3;

public class KitColegialCreator extends CreatorKit{

    @Override
    public KitColegial create() {
        KitColegial kitColegial = new KitColegial();

        kitColegial.setComputadora(new Computadora("Lenovo", "Windows 10"));
        kitColegial.setLibros(new Libros("Benito Juarez", "Juntos por siempre"));
        kitColegial.setMochila(new Mochila(8,"M"));

        return kitColegial;
    }
    
}
