package PracticaPrimerParcial.Ejercicio7;

public class IteratorEmpresa2 implements Iterator{
    private String [] nombres;
    private int position;

    public IteratorEmpresa2(String[] nombres) {
        this.nombres = nombres;
        this.position = 0;
    }

    @Override
    public Object next() {
        return nombres[position];
    }

    @Override
    public boolean hasNext() {
        return nombres.length != 0 && position < nombres.length;
    }
}
