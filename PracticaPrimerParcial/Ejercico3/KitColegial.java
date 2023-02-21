package PracticaPrimerParcial.Ejercico3;

public class KitColegial implements IKit{
    private Computadora computadora = new Computadora();
    private Libros libro = new Libros();
    private Mochila mochila = new Mochila();

    public KitColegial(){}

    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Libros getLibro() {
        return libro;
    }
    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public Mochila getMochila() {
        return mochila;
    }
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    @Override
    public void create() {
        System.out.println("Creando Kit Colegial");
    }

    @Override
    public void showInfo() {
        System.out.println("El Kit Colegial cuenta con:");
        mochila.showInfo();
        libro.showInfo();
        computadora.showInfo();
    }
    
}
