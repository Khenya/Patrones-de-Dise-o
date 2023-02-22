package PracticaPrimerParcial.Ejercico3;

public class KitColegial implements IKit{
    private Computadora computadora ;
    private Libros libros;
    private Mochila mochila;

    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Libros getLibros() {
        return libros;
    }
    public void setLibros(Libros libros) {
        this.libros = libros;
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
    	libros.showInfo();	
        computadora.showInfo();
    }
    
}
