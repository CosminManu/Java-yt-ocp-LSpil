package abstractClasses;

public class Main {

	public static void main(String[] args) {
//		Canine canine = new Canine(); 			// ERR 'Canine' is abstract; cannot be instantiated
		Canine canine2 = new Canine()
		{
			@Override
			public int hashCode() {
				return super.hashCode();
			}

			@Override
			public boolean equals(Object obj) {
				return super.equals(obj);
			}

			@Override
			protected Object clone() throws CloneNotSupportedException {
				return super.clone();
			}

			@Override
			public String toString() {
				return super.toString();
			}

			@Override
			public String getSound() {
				return "I am main!";
			}
		};
		
		Canine w = new Fox();
		w.getSound();			// abstract method w implementation
		w.bark();				// normal method which calls getSound()
	
		Canine q = new Wolf();
		q.bark();
	}
}
