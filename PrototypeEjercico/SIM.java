package PrototypeEjercico;
public class SIM {
    private String name;
    private String number;

    public SIM(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void data() {
        System.out.println("Nombre de la compañia: "+getName());
        System.out.println("Número telefónico: "+getNumber());
    }
}