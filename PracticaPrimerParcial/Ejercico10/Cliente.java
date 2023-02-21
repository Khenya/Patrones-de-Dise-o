package PracticaPrimerParcial.Ejercico10;

public class Cliente {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("4090TXY", "Toyota", "Dorado");
        v1.cobrarPeaje();
        Veiculo v2 = new Veiculo("1234CDB", "Toyota", "Negro");
        v2.cobrarPeaje();
        Veiculo v3 = new Veiculo("9041PKO", "JEEP", "Negro");
        v3.cobrarPeaje();
        Veiculo v4 = new Veiculo("1234NIJ", "BMW", "Rojo");
        v4.cobrarPeaje();
        Veiculo v5 = new Veiculo("5678YOB", "Audi", "Plateado");
        v5.cobrarPeaje();
        Veiculo v6 = new Veiculo("9654BIO", "Audi", "Negro");
        v6.cobrarPeaje();
    }
}
