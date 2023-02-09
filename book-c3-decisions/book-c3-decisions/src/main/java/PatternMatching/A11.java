package PatternMatching;

public class A11 {
	
	void compareIntegers(Number number) {
		if(number instanceof Integer) {				//public final class Integer extends Number
			Integer data = (Integer) number;		// from general to more specific cast
			System.out.println(data.compareTo(5));		// 12 > 5 return 1
		}
		
		//Pattern Matching
		if(number instanceof Integer data){				// NO MORE CAST
			System.out.println(data.compareTo(31));		// 12 < 31 return -1
		}
	}

	public static void main(String[] args) {
		A11 a = new A11();
		a.compareIntegers(12);
	}
}
	/*
	code that particular checks if a variable is of a particular type
	=> cast the variable to that type
	 */
