package OCPbook.autoboxUnbox;

public class Duck {

	public static void main(String[] args) {
		int quack = 5;
		
		final Integer quackquack = quack;		//	Autoboxing 		<=>  = Integer.valueOf(quack);
		int quack3 = quackquack;				//  unboxing		<=>	= ...intValue();
		quack3 = quackquack.intValue();
		
		short i = 9999;		// 4 digits
		Short i1 = i;		// Short.valueOf(i);
		i = i1.byteValue();
		
		char a = 'M';
		Character a1 = a;			// autoboxing	->
		char b = a1.charValue();	// unboxing		<-
		
		Boolean t = true;				// autobox	->
		boolean t1 = t.booleanValue();	// unbox	<-
		
		long largeLong = 999999999999999999L;
		Long bb = largeLong;				// 18 digits	// autobox
		final Long l = Long.valueOf(i);		// autobox
		
		final double test = 6;
		final Double test2 = 6.0;
		final Double test3 = 6D;
		final Double test4 = Double.valueOf(test);
		final double test5 = test2.doubleValue();		//unboxing
		
		Character elephant = null;
//		char badElephant = elephant;		// Unboxing of 'elephant' may produce 'NullPointerException' 
		
	}
}
