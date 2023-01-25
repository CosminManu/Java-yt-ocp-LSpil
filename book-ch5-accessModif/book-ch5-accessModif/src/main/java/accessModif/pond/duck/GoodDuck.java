package accessModif.pond.duck;

public class GoodDuck {

	static public void main(String[] args) {
		System.out.println();
		
		var duck = new MotherDuck();
		
		duck.quack();
		duck.noise = "treci la treaba";			//package access from MotherDuck
		duck.quack();
		
	}
}
