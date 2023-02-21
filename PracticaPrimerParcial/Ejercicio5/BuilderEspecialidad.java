package PracticaPrimerParcial.Ejercicio5;

public abstract class BuilderEspecialidad {
    protected Especialidad especialidad;

    public Especialidad getEspecialidad(){
        return especialidad;
    }

    public void prepararEspecialidad(){
        especialidad = new Especialidad();
    }

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
