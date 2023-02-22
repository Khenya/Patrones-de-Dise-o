package PracticaPrimerParcial.Ejercicio7;

import java.util.List;

public class IteratorEmpresa1 implements Iterator{
    private List<Empleado> empleados;
    private int position;

    public IteratorEmpresa1(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public Empleado next() {
        Empleado empleado = this.empleados.get(position++);
		return empleado;
    }

    @Override
    public boolean hasNext() {
        boolean itHasNext = this.empleados.size() != 0 && position < this.empleados.size();
		return itHasNext;
    }
    
}
