package PracticaPrimerParcial.Ejercicio7;

public class Empresa2 implements Union {
    private Empleado empleados[];
	private String gerente;

	public Empleado[] getEmpleado() {
		return empleados;
	}
	public void setEmpleado(Empleado[] empleado) {
		this.empleados = empleado;
	}

	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Empresa2(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new IteratorEmpresa2(empleados);
		return iterator;
	}
    
}
