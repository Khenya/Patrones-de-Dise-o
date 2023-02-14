package AbstracFactory.Ejercicio;

public class Client {
    public static void main(String[] args) {
        String ipasajeSolidario="pasjeSolidario";
        FactoryPasaje.make(ipasajeSolidario).comprarPasaje();
        FactoryPasaje.make(ipasajeSolidario).showInfo();

        String ipasajeStandard1="pasjeStandard";
        FactoryPasaje.make(ipasajeStandard1).comprarPasaje();
        FactoryPasaje.make(ipasajeStandard1).showInfo();

        String ipasajeInfantes="pasjeInfantes";
        FactoryPasaje.make(ipasajeInfantes).comprarPasaje();
        FactoryPasaje.make(ipasajeInfantes).comprarPasaje();

        String ipasajeSolidario1="pasjeSolidario";
        FactoryPasaje.make(ipasajeSolidario1).comprarPasaje();
        FactoryPasaje.make(ipasajeSolidario1).showInfo();

        String ipasajeStandard="pasjeStandard";
        FactoryPasaje.make(ipasajeStandard).comprarPasaje();
        FactoryPasaje.make(ipasajeStandard).showInfo();

        String ipasajeInfantes1="pasjeInfantes";
        FactoryPasaje.make(ipasajeInfantes1).comprarPasaje();
        FactoryPasaje.make(ipasajeInfantes1).showInfo();
    }
}
