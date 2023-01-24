package payATTENTIONstatic.anotherOne;

public class EFGH {

	String name = "Instance ref";

	static void first(){}

	static void second(){}

	void third() {
		System.out.println(name);
	}

	static public void main(String... args) {
		System.out.println();

		first();
		second();
		
		var object = new EFGH();
		object.third();

//		NO STATIC
	}

}
