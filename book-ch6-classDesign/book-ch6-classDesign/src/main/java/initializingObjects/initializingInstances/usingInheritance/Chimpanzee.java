package initializingObjects.initializingInstances.usingInheritance;

public class Chimpanzee extends Ape {
	
	static {
		System.out.print("abcd-");
	}
	public Chimpanzee(){
		super(2);
		System.out.print("Chimpanzee-");
	}

	public static void main(String[] args) {
		new Chimpanzee();
	}

}
