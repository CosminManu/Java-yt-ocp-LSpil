package thisAndSuper;

public class Beetle extends Insect{
	
	protected int noLegs = 6;
	short age = 3;
	//String label = "b";
	
	public void printData(){
		System.out.println(this.label);
		System.out.println(super.label);
		System.out.println(this.age);
//		System.out.println(super.age);		//'age' doesn't exist in parent class
		System.out.println(noLegs);
	}

	public static void main(String[] args) {
		new Beetle().printData();
	}
}
