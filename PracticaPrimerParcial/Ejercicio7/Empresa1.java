package PracticaPrimerParcial.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements Union {
    private List<Empleado> empleados = new ArrayList<>();
	private String gerente;

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
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

    public Empresa1(String gerente){
        this.gerente = gerente;
        empleados = new ArrayList<>();
    }

    @Override
	public Iterator getIterator() {
		return new IteratorEmpresa1(empleados);
	}
}
