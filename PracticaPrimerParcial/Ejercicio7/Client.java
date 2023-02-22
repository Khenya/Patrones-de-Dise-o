package PracticaPrimerParcial.Ejercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        Empresa1 empresa1 = new Empresa1("Sonia Perales");
        List<Empleado> empleadosEmpresa1 = List.of(new Empleado("Sonia", "Solar", "E25"), new Empleado("Sonia", "Llanos", "E3"));
        empresa1.setEmpleados(empleadosEmpresa1);
    }
}
