package PracticaPrimerParcial.Ejercicio6;

public class Cliente {
    public static void main(String[] args) {
        String message = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Traductor traductor = new Traductor(message);
        String output = traductor.getOutput();
        System.out.println( output );
    }
}
