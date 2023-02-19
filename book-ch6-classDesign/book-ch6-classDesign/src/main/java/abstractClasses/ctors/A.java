package abstractClasses.ctors;

abstract class A {
	abstract CharSequence chew();
	public A() {
		System.out.println(chew());
	}
}
