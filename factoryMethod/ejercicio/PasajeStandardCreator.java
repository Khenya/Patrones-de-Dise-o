package factoryMethod.ejercicio;

public class PasajeStandardCreator extends CreatorPasaje{
    @Override
    public IPasaje crearPasaje(Pasajero pasajero, String numeroDeAsiento){
        PasajeStandard pasajeStandard1 = new PasajeStandard();
        pasajeStandard1.setNumeroDeVuelo(4063);
        pasajeStandard1.setDestino(new Destino("Rusia", "Vladivostok", "Knevichi Oeste"));
        pasajeStandard1.setOrigen(new Origen("Holanda", "Ámsterdam", "Schiphol"));
        pasajeStandard1.setAvion(new Avion("Dassault", 16, "Falcon 7x", 12));
        pasajeStandard1.setPasajero(new Pasajero("Denis Nicolas Ricaldes Mamani", 4523669));
        pasajeStandard1.setAsiento("10A");
        pasajeStandard1.setCostoDePasaje("7930 $");
        return pasajeStandard1;
    }
}
