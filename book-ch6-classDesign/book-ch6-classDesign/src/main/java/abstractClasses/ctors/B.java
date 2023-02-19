package abstractClasses.ctors;

public class B extends A {

	@Override
	String chew() {
		return "abcd";
	}

	public static void main(String[] args) {
		new B();
	}
}
