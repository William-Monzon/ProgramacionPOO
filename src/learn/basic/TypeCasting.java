package learn.basic;

public class TypeCasting {
		public static void intDouble() {
			// crea variable de tipo int
			int num = 10;
		    System.out.println("The integer value: " + num);

		    // convierte la variable int a double
		    double data = num;
		    System.out.println("The double value: " + data + "\n");
		}
		public static void doubleInt() {
			// crea la variable de tipo double
		    double num = 10.99;
		    System.out.println("The double value: " + num);

		    // convierte la varible double a int
		    int data = (int)num;
		    System.out.println("The integer value: " + data + "\n");
		}
		public static void intString() {
			// crea la varibale de tipo int
		    int num = 10;
		    System.out.println("The integer value is: " + num);

		    // convierte la variable int a un String
		    String data = String.valueOf(num);
		    System.out.println("The string value is: " + data + "\n");
		}
		public static void stringInt() {
			// crea variable de tipo String
		    String data = "10";
		    System.out.println("The string value is: " + data);

		    // convierte la variable String a int
		    int num = Integer.parseInt(data);
		    System.out.println("The integer value is: " + num + "\n");
		}
}
