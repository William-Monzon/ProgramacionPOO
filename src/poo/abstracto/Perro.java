package poo.abstracto;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void eat() {
		System.out.println("El perro " + getNombre() + " come");
	}

	public void run() {
		System.out.println("El perro " + getNombre() + " corre");
	}

}
