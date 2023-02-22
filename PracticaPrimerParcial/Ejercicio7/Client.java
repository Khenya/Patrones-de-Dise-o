package PracticaPrimerParcial.Ejercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Lola", "Alvarado", "e354");
        Empleado empleado2 = new Empleado("Conor", "Conde", "e35");
        Empleado empleado3 = new Empleado("Vanesa", "Vilar", "e78");
        Empleado empleado4 = new Empleado("Cornelius", "Espejo", "e302");
        Empleado empleado5 = new Empleado("Daniel", "Nicolas", "e4685");
        Empleado empleado6 = new Empleado("Brenda", "Huayta", "e845");
        Empleado empleado7 = new Empleado("Carlos", "Huayta", "e43");
        Empleado empleado8 = new Empleado("Tati", "Urquieta", "e8");
        Empleado empleado9 = new Empleado("Lola", "Caso", "e58");
        Empleado empleado10 = new Empleado("Tati", "Urquieta", "e8");
        Empleado empleado11 = new Empleado("Lola", "Caso", "e58");
        Empleado empleado12 = new Empleado("Lola", "Caso", "e58");
         
        Empresa1 empresa1 = new Empresa1("Pedro Sejas");
        empresa1.addEmpleado(empleado1);
        empresa1.addEmpleado(empleado2);
        empresa1.addEmpleado(empleado3);

        Empresa2 empresa2 = new Empresa2("Daniel Murillo",3);
        empresa2.addEmpleado(empleado6);
        empresa2.addEmpleado(empleado4);
        empresa2.addEmpleado(empleado5);

        Empresa3 empresa3 = new Empresa3("Camila Perez");
        empresa3.addEmpleado(empleado9);
        empresa3.addEmpleado(empleado7);
        empresa3.addEmpleado(empleado8);

        Empresa4 empresa4 = new Empresa4("Pedro Huayta");
        empresa4.addEmpleado(empleado10);
        empresa4.addEmpleado(empleado11);
        empresa4.addEmpleado(empleado12);

        Map<String, Empleado> nuevaEmpresa = new HashMap<>();

        Iterator iterator = empresa1.getIterator();
        while (iterator.hasNext()){
            Empleado n = iterator.next();
            n.showInfo();
            nuevaEmpresa.put(n.getCodigo(), n);
        
        }

        iterator = empresa2.getIterator();
        while (iterator.hasNext()){
            Empleado n = iterator.next();
            n.showInfo();
            nuevaEmpresa.put(n.getCodigo(), n);
        
        }

        iterator = empresa3.getIterator();
        while (iterator.hasNext()){
            Empleado n = iterator.next();
            n.showInfo();
            nuevaEmpresa.put(n.getCodigo(), n);
        
        }

        iterator = empresa4.getIterator();
        while (iterator.hasNext()){
            Empleado n = iterator.next();
            n.showInfo();
            nuevaEmpresa.put(n.getCodigo(), n);
        
        }
        for(String key:nuevaEmpresa.keySet()){
            System.out.println("***************Núeva Empresa***************");
            nuevaEmpresa.get(key).showInfo();
        }
    }
}
