package inheritingMembers.hidingVariables;

public class Main {

	public static void main(String[] args) {
		
		Meerkat m = new Meerkat();
		Carnivore c = m;				// A m (Meerkat) is a c (Carnivore)
		System.out.println(m.hasFur);	// true de la child class
		System.out.println(c.hasFur);	// false de la parent class
	}

}
