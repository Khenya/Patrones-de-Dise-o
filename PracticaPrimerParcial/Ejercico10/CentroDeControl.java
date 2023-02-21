package PracticaPrimerParcial.Ejercico10;

public class CentroDeControl {
    private Veiculo veiculo;
    private int dinero;
    private static CentroDeControl instance = null;

    private CentroDeControl(Veiculo vehiculo){
        this.veiculo = vehiculo;
        dinero = 0;
        System.out.println("***********Paje*********** ");
    }

    public static CentroDeControl getInstance(Veiculo veiculo){
        if (instance == null)
            instance = new CentroDeControl(veiculo);
        return instance;
    }

    public void cobrar(){
        veiculo.showInfo();
        dinero = dinero + 2;
        System.out.println("Dinero del peaje: " + dinero + " Bs");
    }

}
