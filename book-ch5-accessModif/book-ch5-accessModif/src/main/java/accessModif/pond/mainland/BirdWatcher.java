package accessModif.pond.mainland;

public class BirdWatcher extends Bird{
	
	public void watchBird(){

		System.out.println(ability);		//protected
		System.out.println(name);			//package
		floatInWater();
	}
}
