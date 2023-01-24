package payATTENTIONstatic;

public class ABCD {

	static int n;

	static void first(){}

	static void second(){}

	static void third(){
		n++;
		System.out.println(n);
	}

	static public void main(String... args) {
		System.out.println();

		first();
		second();

		third();		
		/*
		Static method can't call an instance member (= non-static member) without an object reference
		Static method can call other static members
		 */
	}
}
