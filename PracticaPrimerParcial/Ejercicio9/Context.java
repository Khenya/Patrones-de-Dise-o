package PracticaPrimerParcial.Ejercicio9;

public class Context {
    protected String input="";
    protected String output="";

    public Context(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
}
