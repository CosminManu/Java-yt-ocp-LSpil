package payATTENTIONstatic;

public class EFGH {

	String name = "Instance ref";
	
	static int n;

	static void first(){
		System.out.println("first");
	}

	static void second(){
		System.out.println("second");
	}

	void third() {
		System.out.println(name);
		first();					
		n = 10;						//from a normal non-static method u can call a static & a non-static method/variable
	}

	static public void main(String... args) {
		System.out.println();

		first();
		second();

		var object = new EFGH();		// an instance of class
		object.third();

		//		NO STATIC
	}
}
