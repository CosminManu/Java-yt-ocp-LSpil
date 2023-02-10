package switchExpression.firstRuleReturnValue;

public class A {
	/*
	1st rule of switch exp : 
	don't return incompatible or random data types
	 */

	int m = 10;
	int a = switch (m) {
		case 5 -> -1;
		case 10 -> 1;
		default -> (short)2;	// fine short can be implicitly cast to int 
//		case 20 -> "3";			
//		case 20 -> 4L;
//		case 20 -> null;
	};
}
