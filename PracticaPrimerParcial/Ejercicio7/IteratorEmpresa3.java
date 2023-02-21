package PracticaPrimerParcial.Ejercicio7;

import java.util.Vector;

public class IteratorEmpresa3 implements Iterator{
    private Vector<String> nombres;
    private int position;

    public IteratorEmpresa3(Vector<String> nombres) {
        this.nombres = nombres;
        this.position = 0;
    }

    @Override
    public Object next() {
        return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < nombres.size() && nombres.size() != 0;
    }
    
}
