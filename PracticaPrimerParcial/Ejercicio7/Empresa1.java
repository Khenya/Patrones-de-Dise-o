package PracticaPrimerParcial.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements Union {
    List<String> nombres;

    public Empresa1() {
        nombres = new ArrayList<>();
    }

    public void add(String value) {
        nombres.add(value);
    }

    @Override
    public IteratorEmpresa1 iterator() {
        return new IteratorEmpresa1(this.nombres);
    }
}
