package AbstracFactory.Ejercicio;

import factoryMethod.ejercicio.Pasajero;

public class FactoryPasaje {
    public static IPasaje make (String type){
        IPasaje iPasaje;
        Destino destino1 = new Destino("Holanda", "Ámsterdam", "Schiphol");
        Origen origen = new Origen("Perú", "Lima", "Jorge Chávez");
        Avion avion = new Avion("Airbus ", 220, "A380 ", 200);
        Pasajero pasajero = new Pasajero("Pepe Choque", 1354313);
        switch(type.toLowerCase()){
            case "pasajeStandard":
                iPasaje = new PasajeStandard();
                ((PasajeStandard) iPasaje).setAsiento("24A");
                ((PasajeStandard) iPasaje).setCostoDePasaje("400 $");
                ((PasajeStandard) iPasaje).setNumeroDeVuelo(3695);

                ((PasajeStandard) iPasaje).setDestino(destino1);

                ((PasajeStandard) iPasaje).setOrigen(origen);

                ((PasajeStandard) iPasaje).setAvion(avion);

                ((PasajeStandard) iPasaje).setPasajero(pasajero);

                break;
            case "pasajeSolidario":
                iPasaje = new PasajeSolidario();
                ((PasajeSolidario) iPasaje).setAsiento("24A");
                ((PasajeSolidario) iPasaje).setCostoDePasaje("400 $");
                ((PasajeSolidario) iPasaje).setNumeroDeVuelo(3695);
                ((PasajeSolidario) iPasaje).setDescuento("40%");
                ((PasajeSolidario) iPasaje).setMotivoDelDescuento("Cliente frecuente");

                destino1.setAeropuerto("Internacional de el Alto");
                destino1.setCiudad("La Paz");
                destino1.setPais("Bolivia");
                ((PasajeSolidario) iPasaje).setDestino(destino1);

                origen.setAeropuerto("Aeropuerto Internacional Benito Juárez de la Ciudad de México");
                origen.setCiudad("Ciudad de México");
                origen.setPais("México");
                ((PasajeSolidario) iPasaje).setOrigen(origen);

                avion.setCapacidad(500);
                avion.setMarca("AeroExpo");
                avion.setModelo("Collins 55");
                avion.setNumeroDeAsientos(299);
                ((PasajeSolidario) iPasaje).setAvion(avion);

                pasajero.setCI(874238);
                pasajero.setNombre("Brenda Alvarado");
                ((PasajeSolidario) iPasaje).setPasajero(pasajero);
                break;
            default:
                iPasaje = new PasajeInfantes();
                ((PasajeInfantes) iPasaje).setAsiento("24A");
                ((PasajeInfantes) iPasaje).setCostoEspecial("400 $");
                ((PasajeInfantes) iPasaje).setNumeroDeVuelo(3695);

                destino1.setAeropuerto("Heathrow");
                destino1.setCiudad("Londres");
                destino1.setPais("Inglaterra");
                ((PasajeSolidario) iPasaje).setDestino(destino1);

                origen.setAeropuerto("Aeropuerto Internacional John F. Kennedy.");
                origen.setCiudad("Nueva York");
                origen.setPais("Estados Unidos");
                ((PasajeSolidario) iPasaje).setOrigen(origen);

                avion.setCapacidad(350);
                avion.setMarca("Airbus ");
                avion.setModelo("JetBlue");
                avion.setNumeroDeAsientos(114);
                ((PasajeSolidario) iPasaje).setAvion(avion);

                pasajero.setCI(31305374);
                pasajero.setNombre("Jose Luis Ricaldes Conde");
                ((PasajeInfantes) iPasaje).setPasajero(pasajero);
                break;
        }
        return iPasaje;
    }
}
