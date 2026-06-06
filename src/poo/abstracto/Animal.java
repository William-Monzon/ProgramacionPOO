package poo.abstracto;

public abstract class Animal {
	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract void eat();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [" + (nombre != null ? "nombre=" + nombre : "") + "]";
	}
}