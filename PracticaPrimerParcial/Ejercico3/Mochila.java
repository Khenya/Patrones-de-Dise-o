package PracticaPrimerParcial.Ejercico3;

public class Mochila {
    private int numeroBolsillos;
    private String tamano;

    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }
    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo(){
        System.out.println("*******Mochila*******");
        System.out.println("Número De Bolsillos: "+numeroBolsillos);
        System.out.println("Tamaño: "+ tamano);
    }
}
