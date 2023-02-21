package PracticaPrimerParcial.Ejercicio8;

public class Cliente {
    public static void main(String[] args) {
        Cajero cajero = new Cajero("Leo");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoTipo.credito).operation(cajero,56784);
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoTipo.financiamiento).operation(cajero,46);
            }
        });

        thread.start();
        thread1.start();

        FactoryPrestamo.make(FactoryPrestamo.PrestamoTipo.credito).operation(cajero,56784);

        FactoryPrestamo.make(FactoryPrestamo.PrestamoTipo.financiamiento).operation(cajero,468);

    }
}
