package initializingObjects.initializingClasses;

public class Hippo2 {
	public static void main(String[] args) {
		System.out.print("C");
		new Hippo();
		new Hippo();
		new Hippo();
		// even though 3 instances,class is LOADED ONLY ONCE 

//		Hippo h = new Hippo();				// un hipopotam este un hipopotam
//		Animal a = new Hippo();				// un hipopotam este si un animal
//		Hippo h1 = (Hippo) new Animal();	// un animal (general) NU este un hipopotam neaparat (decat daca ii fac cast implicit)
	}

}
