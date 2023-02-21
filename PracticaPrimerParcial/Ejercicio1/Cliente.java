package PracticaPrimerParcial.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        Ventanilla ventanilla = new Ventanilla("CJ12346");

        Estudiante estudiante = new Estudiante("Brenda Alvarado Choque", "E611");
        ventanilla.setEstudiante(estudiante);
        ventanilla.pagoMatricula();

        Estudiante estudiante1 = new Estudiante("Jose Nicolas Conde", "E861");
        ventanilla.setEstudiante(estudiante1);
        ventanilla.pagoMatricula();

        Estudiante estudiante2 = new Estudiante("Nicole Poma Condori", "E452");
        ventanilla.setEstudiante(estudiante2);
        ventanilla.pagoMatricula();
        

        Estudiante estudiante3 = new Estudiante("Luis Calle Caso", "E734");
        ventanilla.setEstudiante(estudiante3);
        ventanilla.pagoMatricula();

        Estudiante estudiante4 = new Estudiante("Daniel Fernandez Gonzales", "E156");
        ventanilla.setEstudiante(estudiante4);
        ventanilla.pagoMatricula();
        
        ventanilla.showInfo();
    }
}
