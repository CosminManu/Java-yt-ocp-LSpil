package OCPbook.passData;

public class PassMethods {

	// Calling METHODS (i.e. StringBuilder) on a reference to an object
	//can affect the initial caller
	
	public static void main(String[] args) {
		var name = new StringBuilder("Cosmin");
		meth(name);
		System.out.println(name);
		
	}
	
	static void meth(StringBuilder name){
		name.append(" si Ileana");
	}
	// 'meth' calls another method on the param
	// parameter name is a copy of the psvm variable name
	// BUT BUT both point to same StringBuilder 
	// => changes made are available to both references
	
}
