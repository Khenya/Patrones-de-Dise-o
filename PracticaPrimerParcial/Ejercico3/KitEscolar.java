package PracticaPrimerParcial.Ejercico3;

public class KitEscolar implements IKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public Cuaderno getCuaderno() {
        return cuaderno;
    }
    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }
    
    public Mochila getMochila() {
        return mochila;
    }
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
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
