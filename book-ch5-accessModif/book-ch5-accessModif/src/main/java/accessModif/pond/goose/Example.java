package accessModif.pond.goose;

import accessModif.pond.mainland.Bird;

public class Example {

	public static void main(String[] args) {
		
		Bird b = new Bird();
//		b.name;				// ERR different packages
//		b.ability;			// ERR 'ability' has protected access (no extends)
		
		b.pub = false;		// public
	
	}
}
