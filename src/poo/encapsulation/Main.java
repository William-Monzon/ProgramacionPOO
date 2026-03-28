package poo.encapsulation;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Contrasena contraseña = new Contrasena("William Monzón", "williamnoe@gmail.com");
		System.out.println("Usuario: " + contraseña.getUsuario());
		System.out.println("Contraseña: " + contraseña.getContraseña());
		System.out.print("\nIngrese la contraseña: ");
		String ingreso = sc.nextLine();
		
		if(contraseña.compararContrasena(ingreso)) {
			System.out.println("Bienvenido " + contraseña.getUsuario());
		}else {
			System.out.println("Contraseña equivocada!");
		}
		
		Estudiante estu = new Estudiante("William", "Primero", 87);
		
		if(estu.paso()==true) {
			System.out.println("\nEl estudiante " + estu.getNombre() + " gano el curso de " + estu.getGrado());
		} else {
			System.out.println("\nEl estudiante " + estu.getNombre() + " perdio el curso de " + estu.getGrado());
		}
		estu.setNombre("Carlos");
		estu.setGrado("Quinto");
		estu.setNota(58);
		
		if(estu.paso()==true) {
			System.out.println("\nEl estudiante " + estu.getNombre() + " gano el curso de " + estu.getGrado());
		} else {
			System.out.println("\nEl estudiante " + estu.getNombre() + " perdio el curso de " + estu.getGrado());
		}
	}

}
