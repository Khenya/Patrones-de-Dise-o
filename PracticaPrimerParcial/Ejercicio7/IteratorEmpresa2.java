package PracticaPrimerParcial.Ejercicio7;

public class IteratorEmpresa2 implements Iterator{
    private Empleado [] empleados;
    private int position;

    public IteratorEmpresa2(Empleado[] empleados) {
        this.empleados = empleados;
        this.position = 0;
    }

    @Override
	public boolean hasNext() {
		boolean itHasNext = this.empleados.length != 0 && position < this.empleados.length;
		return itHasNext;
	}

	@Override
	public Empleado next() {
		Empleado empleado = this.empleados[position++];
		return empleado;
	}
}
