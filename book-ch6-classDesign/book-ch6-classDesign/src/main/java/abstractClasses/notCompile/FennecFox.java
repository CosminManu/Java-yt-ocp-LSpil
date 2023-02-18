package abstractClasses.notCompile;

import abstractClasses.Canine;

public class FennecFox extends Canine {

	@Override
	public String getSound() {
		return "10";
	}
	// ERR attempting to use incompatible return type
	// public int getSound() { .. }
}
