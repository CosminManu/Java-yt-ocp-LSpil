package OCPbook.passData;

public class PassObjects {
	
	// Initial caller doesn't change 
	//(pass-by-value)
	
	static public void main(String... var){
		String name = "Cosmin";
		method(name);
		System.out.println(name);
	}
	
	static void method(String name) {
		name = "George";
	}	// the variable assignment is only to METHOD PARAM
		// and it doesn't affect the caller
}
