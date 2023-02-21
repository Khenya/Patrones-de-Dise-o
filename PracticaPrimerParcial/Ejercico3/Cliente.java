package PracticaPrimerParcial.Ejercico3;

public class Cliente {
    public static void main(String[] args) {
        KitEscolar kitEscolar =  new KitEscolarCreator().create();

        kitEscolar.create();
        kitEscolar.showInfo();
        
        KitColegial kitColegial =  new KitColegialCreator().create();

        kitColegial.create();
        kitColegial.showInfo();
    }
}
