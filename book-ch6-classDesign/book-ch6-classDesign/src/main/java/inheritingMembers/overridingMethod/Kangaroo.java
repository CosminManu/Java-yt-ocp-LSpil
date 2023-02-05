package inheritingMembers.overridingMethod;

public class Kangaroo extends Marsupial {
		
	public double getAverageWeight(){
		return super.getAverageWeight() + 40;
	}

	public static void main(String[] args) {
		System.out.println(new Kangaroo().getAverageWeight());
		System.out.println(new Marsupial().getAverageWeight());
		
		Kangaroo k = new Kangaroo();
		Marsupial m = new Kangaroo();
		Marsupial k1 = new Marsupial();
	}
}

