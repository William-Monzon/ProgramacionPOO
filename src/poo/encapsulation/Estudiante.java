package poo.encapsulation;

public class Estudiante {
	private String nombre;
	private String grado;
	private int nota;
	
	public Estudiante(String nombre, String grado, int nota) {
		super();
		this.nombre = nombre;
		this.grado = grado;
		this.nota = nota;
	}
	public boolean paso() {
		if(nota>=60) {
			return true;
		} else {
			return false;
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
