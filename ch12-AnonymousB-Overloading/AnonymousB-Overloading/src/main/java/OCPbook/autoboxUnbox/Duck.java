package OCPbook.autoboxUnbox;

public class Duck {

	public static void main(String[] args) {
		int quack = 5;
		
		Integer quackquack = quack;		//	Autoboxing 		<=>  = Integer.valueOf(quack);
		int quack3 = quackquack;		//  unboxing		<=>	= ...intValue();
		quack3 = quackquack.intValue();
		
		short i = 9999;
		Short i1 = i;		// Short.valueOf(i);
		i = i1.byteValue();
		
		char a = 'M';
		Character a1 = a;			// autoboxing	->
		char b = a1.charValue();	// unboxing		<-
		
		Boolean t = true;				// autobox	->
		boolean t1 = t.booleanValue();	// unbox	<-
		
		Long bb = 888888888888888888L;
//		Long v = 888888888;			// int cannot wrap (autobox) to Long without implicit cast
		
		
		Character elephant = null;
//		char badElephant = elephant;		// Unboxing of 'elephant' may produce 'NullPointerException' 
		
	}
}
