package initializingObjects.initializingInstances.aLittleHarder;

public class SwordFish {
	
	private String name = "swimmy";
	{
		System.out.println(name);
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	{
		COUNT++;
		System.out.println(COUNT);
	}
	public SwordFish() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Ready?");
		System.out.println("Vodafone.");
		new SwordFish();
	}
}
/*
What does the program output?
 */
/*
no extends => no superclass
-> all static variables/initializers blocks (prints 0)
-> main() method (prints 'ready vodafone')
-> create an instance with 'new' -> instantiate members of class SwordFish ('swimmy 1')
 -> finally the ctor ('constructor')
 */