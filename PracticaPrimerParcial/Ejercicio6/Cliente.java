package PracticaPrimerParcial.Ejercicio6;

public class Cliente {
    public static void main(String[] args) {
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        System.out.println(msg);
        Traductor traductor = new Traductor(msg);
        System.out.println(traductor.traduccion());
    }
}
