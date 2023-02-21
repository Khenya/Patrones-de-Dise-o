package PracticaPrimerParcial.Ejercicio8;

public class Cuenta {
    private static Cuenta instance = null;
    private int monto;
    private Cuenta(int monto) {
        this.monto=monto;
        System.out.println("Monto: " + this.monto);
    }

    public static synchronized Cuenta getUniqueInstance(int monto) {
        if (instance == null)
            instance = new Cuenta(monto);
        return instance;
    }

    public void getPrestamo(int cantidad) {
        if (this.monto > cantidad) {
            this.monto = this.monto - cantidad;
            System.out.println("Monto del prestamo: " + cantidad + " con un saldo de " + monto);
        } else {
            System.out.println("Saldo insuficiente : " + monto);
        }
    }
}
