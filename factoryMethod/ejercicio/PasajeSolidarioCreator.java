package factoryMethod.ejercicio;

public class PasajeSolidarioCreator extends CreatorPasaje{
    @Override
    public IPasaje crearPasaje(Pasajero pasajero, String numeroDeAsiento){
        PasajeSolidario pasajeSolidario1 = new PasajeSolidario();
        pasajeSolidario1.setNumeroDeVuelo(36590);
        pasajeSolidario1.setDestino(new Destino("Alemania", "Tokio", "Haneda"));
        pasajeSolidario1.setOrigen(new Origen("Estados Unidos", "Los Ángeles", "California Fresno Aeropuerto Internacional de Fresno Yosemite"));
        pasajeSolidario1.setAvion(new Avion("Beechcraft King Air", 36, "350i", 30));
        pasajeSolidario1.setPasajero(new Pasajero("Diana Romina Nieves Santos", 96413397));
        pasajeSolidario1.setAsiento("20B");
        pasajeSolidario1.setCostoDePasaje("6739 $");
        pasajeSolidario1.setDescuento("23%");
        pasajeSolidario1.setMotivoDelDescuento("Ser pasajero frecuente de la aerolinea");
        return pasajeSolidario1;
    }
}
