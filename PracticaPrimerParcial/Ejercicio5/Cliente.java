package PracticaPrimerParcial.Ejercicio5;

public class Cliente {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();
        Bife bife = new Bife();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();

        cocinero.setTipoEspecialidad(bife);
        cocinero.buildEspecialidad();
        Especialidad especialidad1 = cocinero.getEspecialidad();
        especialidad1.showInfo();


        cocinero.setTipoEspecialidad(lomito);
        cocinero.buildEspecialidad();
        Especialidad especialidad3 = cocinero.getEspecialidad();
        especialidad3.showInfo();

        
        cocinero.setTipoEspecialidad(tira);
        cocinero.buildEspecialidad();
        Especialidad especialidad2 = cocinero.getEspecialidad();
        especialidad2.showInfo();
    
    }
}
