package PracticaPrimerParcial.Ejercicio2;

public class Contrato implements IContrato{
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducaion;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;
    
    
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }
    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }
    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }
    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }
    public void setAccesoPlataforma(Boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isCursoEducaion() {
        return cursoEducaion;
    }
    public void setCursoEducaion(boolean cursoEducaion) {
        this.cursoEducaion = cursoEducaion;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public Contrato clone(){
        Contrato clone = new Contrato();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducaion(this.isCursoEducaion());
        clone.setAccesoPlataforma(this.getAccesoPlataforma());
        clone.setMarcadoBiometrico(this.getMarcadoBiometrico());
        clone.setMarcadoHoraEntrada(this.getMarcadoHoraEntrada());
        clone.setMarcadoHoraSalida(this.getMarcadoHoraSalida());
        clone.setNombre(this.getNombre());
        clone.setApellido(this.getApellido());
        return clone;
    }

    public void showInfo(){
        System.out.println("**********Contrato" + "de " + this.getNombre() + " " + this.getApellido()+"***************");
        System.out.println("Nombre del docente: " + this.getNombre());
        System.out.println("Apellido del docente: " + this.getApellido());
        System.out.println("Sueldo: " + this.getSueldo());
        System.out.println("Carga horaria del docente: " + this.getCargaHoraria());
        System.out.println("Curso de Educacion Superior: " + this.isCursoEducaion());
        System.out.println("Acceso a la Plataforma: " + this.getAccesoPlataforma());
        System.out.println("Marcado Biometrico: " + this.getMarcadoBiometrico());
        System.out.println("Marcado de Hora de Entrada: " + this.getMarcadoHoraEntrada());
        System.out.println("Marcado de Hora de Salida: " + this.getMarcadoHoraSalida());
    }


}
