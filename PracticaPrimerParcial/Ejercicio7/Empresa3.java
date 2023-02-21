package PracticaPrimerParcial.Ejercicio7;

import java.util.Vector;

public class Empresa3 implements Union {
    Vector<String> nombres;

    public Empresa3() {
        nombres = new Vector<>();
    }

    public void add(String value) {
        nombres.add(value);
    }

    @Override
    public IteratorEmpresa3 iterator() {
        return new IteratorEmpresa3(this.nombres);
    }
}
