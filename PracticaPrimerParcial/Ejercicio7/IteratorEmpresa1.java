package PracticaPrimerParcial.Ejercicio7;

import java.util.List;

public class IteratorEmpresa1 implements Iterator{
    private List<String> nombres;
    private int position;

    public IteratorEmpresa1(List<String> nombres) {
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
