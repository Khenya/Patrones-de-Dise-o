package PracticaPrimerParcial.Ejercicio5;

public class Cocinero {
    private BuilderEspecialidad builder;

    public Especialidad getEspecialidad(){
        return builder.getEspecialidad();
    }
    public void setTipoEspecialidad(BuilderEspecialidad builder){
        this.builder = builder;
    }

    public void buildEspecialidad(){
        this.builder.prepararEspecialidad();
        this.builder.buildTipoCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}
