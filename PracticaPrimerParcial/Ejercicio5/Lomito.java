package PracticaPrimerParcial.Ejercicio5;

public class Lomito extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("Fideo");
    }

}
