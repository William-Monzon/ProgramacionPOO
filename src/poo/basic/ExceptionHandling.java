package poo.basic;
import java.util.Scanner;
public class ExceptionHandling {
	Scanner sc = new Scanner(System.in);
	static void validateInput(int number) throws InvalidInputException{
		if(number>100) {
			throw new InvalidInputException("Exception");
		}
		System.out.println("Valid Input");
	}
	public void exception() {
		System.out.println("Ingrese un valor de entre 0 a 100: ");
		int number = sc.nextInt();
		try {
			validateInput(number);
		}catch(InvalidInputException e) {
			System.out.println("Excepción detectada: el valor introducido es superior a 100");
		}
		sc.close();
	}
	static class InvalidInputException extends Exception{
		public InvalidInputException(String exceptionText) {
			super(exceptionText);
		}
	}

}