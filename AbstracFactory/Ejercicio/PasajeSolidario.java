package AbstracFactory.Ejercicio;

public class PasajeSolidario extends IPasaje{
    private int numeroDeVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private factoryMethod.ejercicio.Pasajero pasajero;
    private String asiento;
    private String costoDePasaje;
    private String descuento;
    private String motivoDelDescuento;
    
    public String getMotivoDelDescuento() {
        return motivoDelDescuento;
    }
    public void setMotivoDelDescuento(String motivoDelDescuento) {
        this.motivoDelDescuento = motivoDelDescuento;
    }

    public String getDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

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

    public factoryMethod.ejercicio.Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(factoryMethod.ejercicio.Pasajero pasajero2) {
        this.pasajero = pasajero2;
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
        System.out.println("**************PASAJE SOLIDARIO**************");
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
        System.out.println("Descuento de: " + descuento);
        System.out.println("El motivo del descuento es: " + motivoDelDescuento);
    }

    @Override
    public void comprarPasaje(){
        System.out.println("Compra de un pasaje solidario ");
    }
}