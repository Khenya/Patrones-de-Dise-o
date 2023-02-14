package PrototypeEjercico;
public class Accesory {
    private String type;

    public Accesory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void characteristic(){
        System.out.print(" " + getType());
    }

}