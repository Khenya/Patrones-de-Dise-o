package PracticaPrimerParcial.Ejercicio7;

public class Empresa2 implements Union {
    private Empleado empleados[];
	private int numeroDeEmpleados;
	private int posicion=0;
	private String gerente;


	public int getNumeroDeEmpleados() {
		return numeroDeEmpleados;
	}
	public void setNumeroDeEmpleados(int numeroDeEmpleados) {
		this.numeroDeEmpleados = numeroDeEmpleados;
	}

	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Empleado[] getEmpleado() {
		return empleados;
	}
	public void setEmpleado(Empleado[] empleado) {
		this.empleados = empleado;
	}
	public void addEmpleado(Empleado empleado){
        if(posicion<numeroDeEmpleados){
            empleados[posicion++]=empleado;
        }
    }

	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Empresa2(String gerente, int numeroDeEmpleados) {
		this.gerente = gerente;
		this.numeroDeEmpleados = numeroDeEmpleados;
        empleados= new Empleado [numeroDeEmpleados];
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new IteratorEmpresa2(empleados);
		return iterator;
	}
    
}
