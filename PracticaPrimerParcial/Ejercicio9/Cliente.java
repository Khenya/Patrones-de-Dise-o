package PracticaPrimerParcial.Ejercicio9;

public class Cliente {
    public static void main(String[] args) {
        String numeros = "1 2 3 4 5 6 7 8 9 10";
		NumerosRomanos numerosRomanos = new NumerosRomanos(numeros);
		String output = numerosRomanos.getOutput();
		System.out.println("Output: " + output);
    }
}
