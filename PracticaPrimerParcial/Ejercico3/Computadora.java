package PracticaPrimerParcial.Ejercico3;

public class Computadora {
    private String marca;
    private String os;

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Computadora(String marca, String sistemaOperativo) {
		this.marca = marca;
		this.os = sistemaOperativo;
	}

    public void showInfo(){
        System.out.println("*******Computadora*******");
        System.out.println("Marca: " + marca );
        System.out.println("Sistema Operativo:  " + os);
    }
}
