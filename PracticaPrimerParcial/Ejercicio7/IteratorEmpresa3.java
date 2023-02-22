package PracticaPrimerParcial.Ejercicio7;

import java.util.Vector;

public class IteratorEmpresa3 implements Iterator{
    private Vector<Empleado> empleados;
    private int position;

    public IteratorEmpresa3(Vector<Empleado> empleados) {
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
