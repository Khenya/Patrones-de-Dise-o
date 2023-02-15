package Builder.EjercicioComputadoras;

public class ComputadoraI9Alto extends BuilderCOmputadora{

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("32gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("45");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("gamer");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i9");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("luminoso");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideso("16");
    }
    
}
