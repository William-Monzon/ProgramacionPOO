package poo.basic;

enum Size {
	 SMALL, MEDIUM, LARGE, EXTRALARGE
	}

public class Enum {
	Size pizzaSize;
	 public Enum(Size pizzaSize) {
	   this.pizzaSize = pizzaSize;
	 }
	 public void orderPizza() {
	   switch(pizzaSize) {
	     case SMALL:
	       System.out.println("I ordered a small size pizza.\n");
	       break;
	     case MEDIUM:
	       System.out.println("I ordered a medium size pizza.\n");
	       break;
	     default:
	       System.out.println("I don't know which one to order.\n");
	       break;
	   }
	 }
}
