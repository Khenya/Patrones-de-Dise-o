package PracticaPrimerParcial.Ejercicio1;

public class Ventanilla {
    private Estudiante estudiante;
    private double matricula;
    private String codigoCajero;

    public String getCodigoCajero() {
        return codigoCajero;
    }
    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public double getMatricula() {
        return matricula;
    }
    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Ventanilla(String codigoCajero){
        this.codigoCajero=codigoCajero;
        Cajero.getInstance().setCodigo(codigoCajero);
        Cajero.getInstance().showInfo();
        matricula = 213.69;
    }

    public void pagoMatricula(){
        if(!estudiante.getMatricula()){
            Cajero.getInstance().pagoACaja(matricula);
            System.out.println("Pago de la matricula de:" + estudiante.getNombre());
            estudiante.setMatricula(true);
        } else{
            System.out.println("El paga ya fue realizado anteriormente: ");
        }
    }
   
    public void showInfo(){
        Cajero.getInstance().showInfo();
    }
}