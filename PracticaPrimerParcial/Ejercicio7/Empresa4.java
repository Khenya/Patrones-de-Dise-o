package PracticaPrimerParcial.Ejercicio7;

import java.util.Stack;

public class Empresa4 implements Union {
    
    private Stack<Empleado> empleados;
    private String gerente;

	public Stack<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Stack<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Empresa4(String gerente) {
		this.gerente = gerente;
		empleados = new Stack<>();
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new IteratorEmpresa4(empleados);
		return iterator;
	}
}
