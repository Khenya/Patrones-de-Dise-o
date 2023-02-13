package factoryMethod.ejercicio;

public class Client {
    public static void main(String [] args){
        // Pasajes tipo standard
        PasajeStandard pasajeStandard1 =(PasajeStandard) new PasajeStandardCreator().crearPasaje(new Pasajero("Jenny Nicole Ramirez Vargas", 456112), "24A");
        PasajeStandard pasajeStandard2 =(PasajeStandard) new PasajeStandardCreator().crearPasaje(new Pasajero("Ama Rodriguez Lopez", 452694), "2c");
        // Pasajes tipo solidario
        PasajeSolidario pasajeSolidario1 =(PasajeSolidario) new PasajeSolidarioCreator().crearPasaje(new Pasajero("Brian Vilar Caso", 675212), "4A");
        PasajeSolidario pasajeSolidario2 =(PasajeSolidario) new PasajeSolidarioCreator().crearPasaje(new Pasajero("Diego Esteban Fernadez Conde", 4514123), "26A");
        // Pasajes tipo infantiles
        PasajeInfantes pasajeInfantes1 =(PasajeInfantes) new PasajeInfantesCreator().crearPasaje(new Pasajero("Ignacio Jose Guillen Huayta", 2858933), "33D");
        PasajeInfantes pasajeInfantes2 =(PasajeInfantes) new PasajeInfantesCreator().crearPasaje(new Pasajero("Khenya Sonia Choque Fernandez ", 1346795), "31A");

        pasajeStandard1.showInfo();
        pasajeStandard2.showInfo();

        pasajeSolidario1.showInfo();
        pasajeSolidario2.showInfo();

        pasajeInfantes2.showInfo();
        pasajeInfantes1.showInfo();

    }
}
