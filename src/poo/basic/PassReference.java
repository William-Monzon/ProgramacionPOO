package poo.basic;

public class PassReference {
	    public void cambioDeVaribles() {
	        Foo a = new Foo(1);
	        Foo b = new Foo(1);

	        // Before Modification
	        System.out.println("Before: a = " + a.num + ", b = " + b.num);
	        
	        modify(a, b);
	        
	        // After Modification
	        System.out.println("After: a = " + a.num + ", b = " + b.num);
	    }
	 
	    public static void modify(Foo a1, Foo b1) {
	        a1.num++;
	       
	        b1 = new Foo(1);
	        b1.num++;
	    }
	}
	 
	class Foo {
	    public int num;
	   
	    public Foo(int num) {
	        this.num = num;
	    }
}
