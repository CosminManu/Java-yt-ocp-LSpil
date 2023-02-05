package initializingObjects.initializingClasses;

public class Hippo extends Animal {
	
	static {
		System.out.print("B");
	}
}

/*
	main() method is inside the Hippo class =>1) initialized the superclass Animal => prints A
	(Hippo extends Animal) 
 	2) initialized Hippo => static block -> prints B
 	
 */
