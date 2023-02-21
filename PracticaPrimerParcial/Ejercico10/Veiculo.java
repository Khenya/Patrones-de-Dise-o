package PracticaPrimerParcial.Ejercico10;

public class Veiculo {
    private String placa;
    private String modelo;
    private String color;
    private CentroDeControl peaje;    

    public Veiculo(String placa, String modelo, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public CentroDeControl getPeaje() {
        return peaje;
    }
    public void setPeaje(CentroDeControl peaje) {
        this.peaje = peaje;
    }
    
    public void showInfo(){
        System.out.println("***********Vehículo***********");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }

    public void cobrarPeaje(){
        CentroDeControl.getInstance(this).cobrar();
    }
}
