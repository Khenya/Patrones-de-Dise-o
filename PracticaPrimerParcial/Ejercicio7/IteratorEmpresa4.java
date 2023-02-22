package PracticaPrimerParcial.Ejercicio7;

import java.util.Stack;

public class IteratorEmpresa4 implements Iterator{
    private Stack<Empleado> empleados;

    public IteratorEmpresa4(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public Empleado next() {
        Empleado empleado = empleados.peek();
		empleados.pop();
		return empleado;
	}

    @Override
    public boolean hasNext() {
        boolean itHasNext = !empleados.isEmpty();
		return itHasNext;
	}
}
