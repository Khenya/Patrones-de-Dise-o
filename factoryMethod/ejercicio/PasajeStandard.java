package factoryMethod.ejercicio;

public class PasajeStandard implements IPasaje{
    private int numeroDeVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private String asiento;
    private String costoDePasaje;
    
    public String getCostoDePasaje() {
        return costoDePasaje;
    }
    public void setCostoDePasaje(String costoDePasaje) {
        this.costoDePasaje = costoDePasaje;
    }

    public String getAsiento() {
        return asiento;
    }
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Origen getOrigen() {
        return origen;
    }
    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Destino getDestino() {
        return destino;
    }
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }
    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    @Override
    public void showInfo(){
        System.out.println("**************PASAJE STANDARD**************");
        System.out.println("Número de vuelo: " + numeroDeVuelo);
        System.out.println("Origen: ");
        origen.showInfo();
        System.out.println("Destino: ");
        destino.showInfo();
        System.out.println("Avion: ");
        avion.showInfo();
        System.out.println("Pasajero: ");
        pasajero.showInfo();
        System.out.println("Número de asiento: " + asiento);
        System.out.println("Costo del pasaje: " + costoDePasaje);
    }

    @Override
    public void comprarPasaje(){
        System.out.println("Compra de un pasaje standard");
    }
}
