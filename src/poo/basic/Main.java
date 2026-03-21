package poo.basic;
import learn.basic.TypeCasting;
import java.util.Scanner;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("1. Type Casting");
			System.out.println("2. Enum");
			System.out.println("3. Initializer Block");
			System.out.println("4. Pass Value/Pass Reference");
			System.out.println("5. Exception Handling");
			System.out.println("6. Salir");
			
			opcion = pedirEntero("Ingrese la opción: ");
			switch(opcion){
			case 1:
				System.out.println("\nType Casting");
				TypeCasting.intDouble();
				TypeCasting.doubleInt();
				TypeCasting.intString();
				TypeCasting.stringInt();
				pausar();
				break;
			case 2:
				System.out.println("\nEnum");
				Enum enum1 = new Enum(Size.SMALL);
				enum1.orderPizza();
				pausar();
				break;
			case 3:
				System.out.println("\nInitializer Block");
				new InitializerBlock();
				pausar();
				break;
			case 4:
				System.out.println("\nPass Value/Pass Reference");
				PassReference cambio = new PassReference();
				cambio.cambioDeVaribles();
				pausar();
				break;
			case 5:
				System.out.println("\nException Handling");
				ExceptionHandling error = new ExceptionHandling();
				error.exception();
				pausar();
				break;
			case 6:
				System.out.println("\nUsted ha salido");
				break;
				default: System.out.println("Uste ingrreso una opción incorrecta!");
			}
		}while(opcion!=6);
		sc.close();
	}
	
	public static int pedirEntero(String mensaje) {
		System.out.print(mensaje);
		return sc.nextInt();
	}
	public static void pausar() {
		System.out.println("\nPresione Enter para continuar...");
		sc.nextLine();
		sc.nextLine();
	}
	
}
