package factoryMethod.ejercicio;

public class Pasajero {
    private String nombre;
    private int CI;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public Pasajero(String nombre, int CI){
        this.nombre=nombre;
        this.CI=CI;
    }

    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + CI);
    }
}