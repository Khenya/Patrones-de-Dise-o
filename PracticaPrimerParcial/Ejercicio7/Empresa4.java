package PracticaPrimerParcial.Ejercicio7;

import java.util.Stack;

public class Empresa4 implements Union {
    
    private Stack<String> nombres ;
    public Empresa4(){
        nombres= new Stack<>();
    }
    public void add(String value){
        nombres.add(value);
    }
    @Override
    public IteratorEmpresa4 iterator() {
        return  new IteratorEmpresa4(nombres);
    }
}
