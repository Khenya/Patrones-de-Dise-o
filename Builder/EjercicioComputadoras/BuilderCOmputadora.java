package Builder.EjercicioComputadoras;

public abstract class BuilderCOmputadora {
    protected  Computadora computadora;

    public Computadora getComputadora(){
        return computadora;
    }

    public void createComputadora(){
        computadora = new Computadora();
    }

    public abstract void buildMonitor();
    public abstract void buildTeclado();
    public abstract void buildMouse();
    public abstract void buildMemoria();
    public abstract void buildProcesador();
    public abstract void buildVideo();
}

