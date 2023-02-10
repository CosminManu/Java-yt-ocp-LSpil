package switchExpression;

public class SExp {

	final protected int varToTest = 2_000_000_000;	// maximum around 2 miliards
	
	void func(){
		int result = switch (varToTest){
			case 2 * 3 -> 6;
			case varToTest -> 10;
			
			default -> 20;
		};
	}
	// no breaks anymore
}
