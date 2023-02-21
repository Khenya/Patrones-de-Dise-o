package PracticaPrimerParcial.Ejercicio5;

public class Tira extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("Tira");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("Fideo");
    }
}
