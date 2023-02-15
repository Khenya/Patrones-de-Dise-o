package Builder.EjercicioComputadoras;

public class Computadora {
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;

    public String getVideso() {
        return video;
    }
    public void setVideso(String video) {
        this.video = video;
    }

    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMemoria() {
        return memoria;
    }
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    public void showInfo() {
        System.out.println("tipo de monitor: "+ monitor);
        System.out.println("tipo de teclado: "+ teclado);
        System.out.println("tipo de mouse: "+ mouse);
        System.out.println("tipo de memoria: "+ memoria);
        System.out.println("tipo de procesador: "+ procesador);
        System.out.println("tipo de video: "+ video);
    }
}