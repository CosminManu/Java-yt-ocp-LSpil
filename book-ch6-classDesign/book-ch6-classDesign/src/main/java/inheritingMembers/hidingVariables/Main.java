package inheritingMembers.hidingVariables;

public class Main {

	public static void main(String[] args) {
		
		Meerkat m = new Meerkat();
		Carnivore c = m;				// A m (Meerkat) is a c (Carnivore)
		System.out.println(m.hasFur);	// true de la child class
		System.out.println(c.hasFur);	// false de la parent class
	}

}
/*
 * A single object is created => variable m is instanced with 'new'
 * 
 * As with hiding a static method, you cannot override a variable; you can only HIDE that variable
 */