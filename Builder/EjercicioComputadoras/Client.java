package Builder.EjercicioComputadoras;

public class Client {
    public static void main(String[] args) {
        Dueno dueno = new Dueno();
        ComputadoraI5Bajo i5Bajo = new ComputadoraI5Bajo();
        ComputadoraI7Medio i7Medio = new ComputadoraI7Medio();
        ComputadoraI9Alto i9Alto = new ComputadoraI9Alto();

        // I9
        dueno.setTipoComputadora(i9Alto);
        dueno.BuilderComputadora();

        Computadora computadora = dueno.getComputadora();
        computadora.showInfo();

        System.out.println("**************************");

        //i7
        dueno.setTipoComputadora(i7Medio);
        dueno.BuilderComputadora();

        Computadora computadorai7 = dueno.getComputadora();
        computadorai7.showInfo();

        System.out.println("**************************");

        //i5
        dueno.setTipoComputadora(i5Bajo);
        dueno.BuilderComputadora();

        Computadora computadorai5 = dueno.getComputadora();
        computadorai5.showInfo();

    }
}
