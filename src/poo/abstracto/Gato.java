package poo.abstracto;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public void eat() {
		System.out.println("El gato " + getNombre() + " come");
	}

	public void skip() {
		System.out.println("El gato " + getNombre() + " salta");
	}

}
