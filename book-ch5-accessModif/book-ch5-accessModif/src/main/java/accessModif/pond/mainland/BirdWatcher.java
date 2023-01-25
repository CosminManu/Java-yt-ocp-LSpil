package accessModif.pond.mainland;

public class BirdWatcher {
	
	public void watchBird(){
		Bird b = new Bird();

		System.out.println(b.ability);		//protected = package + extends
		System.out.println(b.name);			//package
		b.floatInWater();
	}
}
