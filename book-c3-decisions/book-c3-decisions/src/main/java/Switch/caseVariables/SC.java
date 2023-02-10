package Switch.caseVariables;

public class SC {

	final int getCookies() {
		return 4;
	}

	void feedAnimals() {
		final int bananas = 1;
		int apples = 2;
		int numberOfAnimals = 3;
		final int cookies = getCookies();

		switch (numberOfAnimals) {
			case bananas:
			case 10 * 10: 
				
//			case "banana":		// Required int provided String				
//			case apples :		// NOT final > NOT constant value
//			case getCookies();						
//			case cookies;		// METHODS are not evaluate until runtime
		}
	}

	public static void main(String[] args) {
		SC sc = new SC();
		sc.feedAnimals();
	}
}