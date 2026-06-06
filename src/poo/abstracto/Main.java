package poo.abstracto;

public class Main {

	public static void main(String[] args) {
		Animal bird = new Pajaro("Piolin");
		Animal dog = new Perro("Tobby");
		Animal cat = new Gato("Tom");

		bird.eat();
		if (bird instanceof Pajaro) { // Digo que el bird es instancia de Pajaro, para llamar al método fly(), usando casteo de tipos
			((Pajaro) bird).fly();
		}

		dog.eat();
		if (dog instanceof Perro) {
			((Perro) dog).run();
		}
		cat.eat();
		if (cat instanceof Gato) {
			((Gato) cat).skip();
		}
	}

}
