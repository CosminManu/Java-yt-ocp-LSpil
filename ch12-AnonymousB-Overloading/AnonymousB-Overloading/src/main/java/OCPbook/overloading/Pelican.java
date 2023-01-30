package OCPbook.overloading;

public class Pelican {

	static public void main(String... a) {
		var p = new Pelican();

		p.fly("asdf");
		System.out.print("-");
		p.fly(123);
		/*
		2nd call looks for int parameter list
		no int parameter => autobox to Integer
		no Integer param => Object 
		 */

		System.out.println();
		p.flyy(10);
	}

	public void fly(String s) {
		System.out.print("string");
	}

	public void fly(Object o) {
		System.out.print("object");
	}
	
	public void flyy(int numMiles){
		System.out.println("primitive");
	}
	public void flyy(Integer numMiles){
		System.out.println("wrapper class");
	}
	// when flyy(nt ..) version is not present Java will try to autobox -> Integer 
	//Arrays do not autobox  (int[] not-> Integer[])
	
	
	
}
