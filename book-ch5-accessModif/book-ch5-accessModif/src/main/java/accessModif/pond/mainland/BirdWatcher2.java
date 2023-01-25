package accessModif.pond.mainland;

public class BirdWatcher2 {
	
	public void watchBird(){
	
		Bird b = new Bird();

		System.out.println(b.name);
		System.out.println(b.ability);
		b.floatInWater();
	}
}
