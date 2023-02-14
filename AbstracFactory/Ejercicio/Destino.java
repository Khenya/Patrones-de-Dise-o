package AbstracFactory.Ejercicio;

public class Destino {
    private String pais;
    private String ciudad;
    private String aeropuerto;

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Destino(String pais, String ciudad, String aeropuerto){
        this.pais=pais;
        this.ciudad=ciudad;
        this.aeropuerto = aeropuerto;
    }

    public void showInfo(){
        System.out.println("Pais de destino: " + pais);
        System.out.println("Ciudad de destino: " + ciudad);
        System.out.print("Aeropueto de destino: " + aeropuerto);
    }
}