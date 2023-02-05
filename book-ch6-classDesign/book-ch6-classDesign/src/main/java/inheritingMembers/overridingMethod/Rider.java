package inheritingMembers.overridingMethod;

public class Rider {
	
	static public void main(String... args){
		Camel c = new ArabianCamel();
		Camel camel = new Camel();
		System.out.println(c.getNumberOfHumps());
		
	}
}
