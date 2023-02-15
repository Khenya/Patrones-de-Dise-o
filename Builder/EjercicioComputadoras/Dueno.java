package Builder.EjercicioComputadoras;

public class Dueno {
    private BuilderCOmputadora builder;

    public Computadora getComputadora(){
        return builder.getComputadora();
    }

    public void setTipoComputadora(BuilderCOmputadora builder){
        this.builder = builder;
    }

    public void BuilderComputadora(){
        this.builder.createComputadora();
        this.builder.buildMemoria();
        this.builder.buildMonitor();
        this.builder.buildMouse();
        this.builder.buildProcesador();
        this.builder.buildTeclado();
        this.builder.buildVideo();
    }

}
