package PracticaPrimerParcial.Ejercicio5;

public class Especialidad {
    private String tipoCarne;
    private String saborRefresco;
    private String guarniciones;

    public String getTipoCarne(){
        return tipoCarne;
    }
    public Especialidad setTipoCarne(String tipoCarne){
        this.tipoCarne = tipoCarne;
        return this;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }
    public Especialidad setSaborRefresco(String saborRefresco){
        this.saborRefresco = saborRefresco;
        return this;
    }

    public String getGuarniciones() {
        return guarniciones;
    }
    public Especialidad setGuarniciones(String guarniciones){
        this.guarniciones = guarniciones;
        return this;
    }

    public void showInfo(){
        System.out.println("Tipo de Carne: " + tipoCarne);
        System.out.println("Sabor del Refresco: " + saborRefresco);
        System.out.println("Guarniciones: " + guarniciones);
    }
}
