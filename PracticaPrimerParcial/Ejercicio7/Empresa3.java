package PracticaPrimerParcial.Ejercicio7;

import java.util.Vector;

public class Empresa3 implements Union {
    private Vector<Empleado> empleados;
    private String gerente;

    public Vector<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Vector<Empleado> empleados) {
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

    public Empresa3(String gerente) {
        this.gerente = gerente;
		empleados = new Vector<>();
    }

    @Override
    public Iterator getIterator() {
		Iterator iterator = new IteratorEmpresa3(empleados);
		return iterator;
	}
}
