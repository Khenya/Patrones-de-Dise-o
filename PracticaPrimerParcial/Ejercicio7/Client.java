package PracticaPrimerParcial.Ejercicio7;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        int i =0;
        HashMap<String,String> union = new HashMap<>();

        Empresa1 lista1 = new Empresa1();
        lista1.add("Pedro Poma");
        lista1.add("Nicolas Murillo");

        Empresa2 lista2 = new Empresa2();
        lista2.add("Yamil Idalgo");
        lista2.add("Nicole Quisbert");

        Empresa3 lista3 = new Empresa3();
        lista3.add("Camilo Vilar");
        lista3.add("Perez Noval");

        Empresa4 lista4 = new Empresa4();
        lista4.add("Codi Alvarado");
        lista4.add("Estefany Delgado");

        Iterator iterator;
        iterator = lista1.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            union.put(nombre,nombre);
        }

        iterator = lista2.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            union.put(nombre,nombre);
        }
        iterator = lista3.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            union.put(nombre,nombre);
        }
        iterator = lista4.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            union.put(nombre,nombre);
        }

        for (String key:union.keySet()
        ) {
            i++;
            System.out.println("Empleado " + i + ": " + union.get(key));
        }
    }
}
