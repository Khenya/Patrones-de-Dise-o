package PracticaPrimerParcial.Ejercicio8;

public class FactoryPrestamo {
    public enum PrestamoTipo {credito, financiamiento, vivienda, negocio}

    public static Prestamo make(PrestamoTipo prestamoTipo){
        Prestamo prestamo;
        switch (prestamoTipo){

            case credito:
                prestamo = new PrestamoCredito();
                break;
            case financiamiento:
                prestamo = new PrestamoFinanciamiento();
                break;
            case vivienda:
                prestamo = new PrestamoVivienda();
                break;
            case negocio:
                prestamo = new PrestamoNegocio();
                break;
            default:
                prestamo = new PrestamoNegocio();
                break;
        }
        return prestamo;
    }
}
