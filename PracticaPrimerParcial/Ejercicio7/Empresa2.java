package PracticaPrimerParcial.Ejercicio7;

public class Empresa2 implements Union {
    private int position;
    private String [] nombres ;
    public Empresa2(){
        position=0;
        nombres= new String[4];
    }
    public void add(String value){
        nombres[position]=value;
        position++;
    }
    @Override
    public IteratorEmpresa2 iterator() {
        return  new IteratorEmpresa2(nombres);
    }
    
}
