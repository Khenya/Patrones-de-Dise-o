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

    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Empresa1(String gerente){
        this.gerente = gerente;
    }
    @Override
	public Iterator getIterator() {
		Iterator iterator = new IteratorEmpresa1(empleados);
		return iterator;
	}
}
