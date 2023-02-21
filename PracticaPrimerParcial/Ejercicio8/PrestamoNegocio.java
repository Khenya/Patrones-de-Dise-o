package PracticaPrimerParcial.Ejercicio8;

public class PrestamoNegocio extends Prestamo{
    @Override
    public void operation(Cajero cajero,int canrtidad) {
        Cuenta.getUniqueInstance(6874351).getPrestamo(canrtidad);
    }
}
