package PracticaPrimerParcial.Ejercico3;

public class Cuaderno {
    private String tipo;
    private int hojas;

    public int getHojas() {
        return hojas;
    }
    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void showInfo(){
        System.out.println("*******Cuaderno*******");
        System.out.println("Tipo: " + tipo );
        System.out.println("Número de hojas:  " + hojas);
    }
}
