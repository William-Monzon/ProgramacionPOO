package poo.inheritance;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("1292PI0", "Toyota");
		
		carro.descipcion();
		carro.arranque();
		
		Camion camion = new Camion("3899KG6", "Mitsubishi");
		try {
			
			Vehiculo vehiculo = camion;
			
			if(!(vehiculo instanceof Carro)) {
				
				throw new ClassCastException("Operación invalida!");
			}
			
			Carro car2 = (Carro) vehiculo;
		
			car2.descipcion();
				
		} catch(ClassCastException e) {
			System.out.println("\nError: " + e.getMessage());
		}
		camion.descipcion();
		camion.arranque();
	}

}
