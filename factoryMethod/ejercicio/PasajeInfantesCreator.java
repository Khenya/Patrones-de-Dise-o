package factoryMethod.ejercicio;

public class PasajeInfantesCreator extends CreatorPasaje{
    @Override
    public IPasaje crearPasaje(Pasajero pasajero, String numeroDeAsiento){
        PasajeInfantes pasajeInfantes1 = new PasajeInfantes();
        pasajeInfantes1.setNumeroDeVuelo(66690);
        pasajeInfantes1.setDestino(new Destino("Paris", "Francia", "Charles De Gaulle"));
        pasajeInfantes1.setOrigen(new Origen("Estados Unidos", "Nueva York", "Aeropuerto Internacional John F. Kennedy "));
        pasajeInfantes1.setAvion(new Avion("Diamond", 150, "DA42", 145));
        pasajeInfantes1.setPasajero(new Pasajero("Joselo Ian Choque Rosales", 64384222));
        pasajeInfantes1.setAsiento("9D");
        pasajeInfantes1.setCostoEspecial("630 $");
        return pasajeInfantes1;
    }
}
