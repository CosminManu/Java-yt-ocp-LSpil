package exStaticFinal;

public class ZooInventoryManager {

	// static final = constants
	
	private final static String[] OBJECTS = new String[10];
	
	final static String NAME = "Laurentiu";		//assign a value when declared
	static final int NO_ANIMALS;
	static {
		NO_ANIMALS = 10000;					// assign a value in static initializer block
	}
	
//	static final boolean abc;		ERR
//	static void m(){
//		NO_ANIMALS = 100000;			ERR Cannot assign a value to final variable
//	}
	
	static public void main(String... m){
		OBJECTS[8] = "Food";		// allowed to modify arrays' objects
//		objects = new String[5];
		
		
	
	}
	
}
