package inheritingMembers.hidingMethods;

public class Panda extends Bear {

	public static void eat(){
		System.out.println("Panda is fucking");
	}

	public static void main(String[] args) {
		eat();
	}
}

/* HIDING METHODS
previous 4 rules from overriding + Rule #5 
Rule #5: if method in parent is marked static => method in child is static
 
 if both methods are marked static -> HIDING not overriding
 */
