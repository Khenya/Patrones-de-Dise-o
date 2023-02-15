package Builder.EjercicioComputadoras;

public class ComputadoraI7Medio extends BuilderCOmputadora{

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("16gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("32");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("luminoso");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i7");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("luminoso");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideso("8");
    }
    
}
