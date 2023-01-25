package accessModif.pond.duck;

public class MotherDuck {

	String noise = "quack";			// NO access modifier => package access
	void quack(){
		System.out.println(noise);
	}
}
