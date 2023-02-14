package AbstracFactory.Ejercicio;


public class FactoryPasaje {
    public static IPasaje make (String type){
        IPasaje iPasaje;
        switch(type.toLowerCase()){
            case "pasajeStandard":
                iPasaje = new PasajeStandard();
                break;
            case "pasajeSolidario":
                iPasaje = new PasajeSolidario();
                break;
            default:
                iPasaje = new PasajeInfantes();
                break;
        }
        return iPasaje;
    }
}
