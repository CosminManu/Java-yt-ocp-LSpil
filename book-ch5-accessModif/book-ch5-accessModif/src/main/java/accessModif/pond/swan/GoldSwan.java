package accessModif.pond.swan;

import accessModif.pond.mainland.Bird;

public class GoldSwan extends Bird {
	
	public void swim() {
		floatInWater();
		ability = "precious";
	}
	/* members used without referring  
	protected access is allowed */
	
	public void helpOtherGoldSwansSwim() {
		GoldSwan g = new GoldSwan();
		g.ability = "swim";				// subclass
		g.floatInWater();
	}
	
	public void helpOtherBIRDS() {
		Bird fsdafd = new Bird();
//		fsdafd.ability = "swim";		// package access, not same package (bird is not inheriting from anywhere)
	}

}
