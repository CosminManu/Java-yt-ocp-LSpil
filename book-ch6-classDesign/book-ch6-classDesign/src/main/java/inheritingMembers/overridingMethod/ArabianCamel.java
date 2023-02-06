package inheritingMembers.overridingMethod;

public class ArabianCamel extends Camel {

	protected int getNumberOfHumps() {
		return 20;
	}
	// ERR  attempting to assign weaker access privileges; was public not private, package or protected
	// ERR  attempting to assign weaker access privileges; was protected not private or package
}
/*
Rule#1 overriding: same name + same parameters 
Rule #2 : method in the child class must be at least as accessible as parent class

Rule #3 : checked/unchecked exceptions
Rule #4 : return type of the overridden method must be covariant with return type of ht inherited method
 */
