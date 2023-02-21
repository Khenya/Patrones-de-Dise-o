package PracticaPrimerParcial.Ejercicio1;

public class Cajero {
    private static Cajero instance = null;
    private String codigo;
    private double caja;

    private Cajero(){
        this.caja=0;
    }

    public static Cajero getInstance(){
        if (instance == null){
            multiThreadManage();;
        }
        return instance;
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Cajero();
        }
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }


    public void pagoACaja(double monto){
        this.caja=this.caja+monto;
    }

    public void showInfo(){
        System.out.println("Cantidad de dinero en caja: " + caja);
        System.out.println("Código de cajero: " + codigo);
    }

}
