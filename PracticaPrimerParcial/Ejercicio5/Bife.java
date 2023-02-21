package PracticaPrimerParcial.Ejercicio5;

public class Bife extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("Papas Fritas");
    }

}
