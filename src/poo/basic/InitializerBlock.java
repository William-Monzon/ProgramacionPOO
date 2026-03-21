package poo.basic;

public class InitializerBlock {
	static {
        System.out.println("Static initializer block");
    }
    
    {
        System.out.println("Instance initializer block");
    }
    
    public InitializerBlock() {
		System.out.println("Class constructor");
	}
        
}
