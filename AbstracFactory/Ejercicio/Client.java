package AbstracFactory.Ejercicio;

public class Client {
    public static void main(String[] args) {
        String ipasajeSolidario="pasjeSolidario";
        PasajeStandard pasajeSolidario1 = (PasajeStandard) FactoryPasaje.make(ipasajeSolidario);
        pasajeSolidario1.comprarPasaje();
        pasajeSolidario1.showInfo();

        
        PasajeStandard pasajeSolidario2 = (PasajeStandard) FactoryPasaje.make(ipasajeSolidario);
        pasajeSolidario2.comprarPasaje();
        pasajeSolidario2.setAsiento("9A");
        pasajeSolidario2.showInfo();


        String ipasajeStandard1="pasjeStandard";
        PasajeStandard pasajeStandard1 = (PasajeStandard) FactoryPasaje.make(ipasajeStandard1);
        pasajeStandard1.comprarPasaje();
        pasajeStandard1.showInfo();

        PasajeStandard pasajeStandard2 = (PasajeStandard) FactoryPasaje.make(ipasajeStandard1);
        pasajeStandard2.comprarPasaje();
        pasajeStandard2.setAsiento("99C");
        pasajeStandard2.showInfo();

        String ipasajeInfantes="pasjeInfantes";

        PasajeInfantes pasajeInfantes1 = (PasajeInfantes) FactoryPasaje.make(ipasajeInfantes);
        pasajeInfantes1.comprarPasaje();
        pasajeInfantes1.showInfo();

        PasajeInfantes pasajeInfantes2 = (PasajeInfantes) FactoryPasaje.make(ipasajeInfantes);
        pasajeInfantes2.comprarPasaje();
        pasajeInfantes2.setAsiento("53B");
        pasajeInfantes2.showInfo();

    }
}
