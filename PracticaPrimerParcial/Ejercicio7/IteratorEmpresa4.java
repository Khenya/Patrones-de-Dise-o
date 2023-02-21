package PracticaPrimerParcial.Ejercicio7;

import java.util.Stack;

public class IteratorEmpresa4 implements Iterator{
    private Stack<String> nombres;
    private int position;

    public IteratorEmpresa4(Stack<String> nombres) {
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
