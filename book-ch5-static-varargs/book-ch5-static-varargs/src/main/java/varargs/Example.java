package varargs;

public class Example {

	public static void main(String... args) {
		System.out.println();
		
		VisitAttractions v = new VisitAttractions();
		int[] data = new int[] {1, 2, 3};
		
		v.walk1(data);						// pass an array
		v.walk1(5, 7, 9, 11, 23);		//pass direct values
		System.out.println();
		
		v.walk2(1);		// empty array if no parameters for a vararg
		v.walk2(2);
		v.walk2(3, 4);
		v.walk2(3, 4, 5);
//		v.walk2(1, null);			// NullPointerExcep Cannot read the array length because "steps" is null 
		
		v.run(345, 225, 356);		// access through indexing
		
		
	}

}
