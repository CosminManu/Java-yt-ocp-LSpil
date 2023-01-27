package OCPbook.autoboxUnbox;

public class Chimpanzee {
	
	public void climb(long t){}
	public void swing(Integer u){}
	
	static public void main(String... a){
		var c = new Chimpanzee();
		c.climb(123);				// int casted autom to long
		
		c.swing(999999999);		// max 10 digits to be considered int (Integer)
		c.swing(null);
		
//		c.swing(999999L);	// not convert autom to narrower type
		
		/*
		Automatically cast
		int -> long   (primitive)
		int -> Integer
		 */
	} 
}
