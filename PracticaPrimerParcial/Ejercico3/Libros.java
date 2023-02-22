package PracticaPrimerParcial.Ejercico3;

public class Libros {
    private String tipo;
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Libros(String autor, String tipo) {
		this.autor = autor;
		this.tipo = tipo;
	}

    public void showInfo(){
        System.out.println("*******Libros*******");
        System.out.println("Tipo: " + tipo );
        System.out.println("Autor:  " + autor);
    }
}
