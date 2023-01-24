package exStaticFinal;

public class anotherExample {
	
	private static int one;
	static private final int two;
	static final private int three = 3;
//	private static final int four;			// ERR
	
	static {
		one = 1;
		two = 2;
//		three = 3;			// ERR already assigned
//		two = 4;			// ERR already assigned
	}
	
	//in practice avoid static initializers => use ctors
	// use static init when code requires >1line <=> ArrayList & HashMaps

}
