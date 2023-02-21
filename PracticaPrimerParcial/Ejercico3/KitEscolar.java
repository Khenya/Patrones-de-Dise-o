package PracticaPrimerParcial.Ejercico3;

public class KitEscolar implements IKit{
    private Mochila mochila = new Mochila();
    private Deportivo deportivo = new Deportivo();
    private Cuaderno cuaderno = new Cuaderno();

    public KitEscolar(){}

    public Mochila getMochila() {
        return mochila;
    }
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }
    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }
    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    @Override
    public void create() {
        System.out.println("Creando Kit Escolar");
    }

    @Override
    public void showInfo() {
        System.out.println("El Kit Escolar cuenta con:");
        mochila.showInfo();
        deportivo.showInfo();
        cuaderno.showInfo();
    }
    
}
