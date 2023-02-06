package designingMethods;

public class MethodDeclaration {
	
	public final void nap(int minutes) throws InterruptedException {
	//1      2     3   4   	5             6
		// method body 
	}
	
	final protected void eat(int hours){ return;}
	// 2      1       3    4...
	final void drink(int seconds){}
	//2     3     4   ...  (1 is default package)
	
	public static final void drink2(){}						// 1 2static+final 3
	public final static void drink3(){}						// 1 2final+static 3
	final static protected int drink4(){return 0;}			// 2 1 3 protected access
	final static Integer drink5(){return 0;}				// 2 (1) 3 package access + wrapper class
	Double drink6(){return 0.0;}							// (1) 3  because 2 is optional
	public boolean drink7(){return true;}					// 1 3  because 2 is optional
//	public boolean static drink8(){return true;}			// ERR 1 3 2  not allowed 2 after 3
//	public eat4(){}							//	3 mandatory
	
	
	//4, 5, 6 are always same order (4 name of method)
	//3 return type(mandatory) ALWAYS LAST before 4 
}
/*	METHODS
	1 - access modifier (from most to less restrictive: private, package(default), protected, public
	2 - (optional) specifiers : final, static, abstract, default, synchronized
	3 - return type : void int String boolean, List<String>, Integer etc
	4 - method name
	5 - list of parameters
	 nap(int), nap(String), nap(long) etc => method signature
	6 - (optional) list of exceptions
	
	1,2,3 -> where the method can be referenced
 	4,5 	-> how  the method can be referenced
 
 	final = specifies a method my not be overridden in subclass (child class)
 	static = method is a member of the shared class object
 	abstract = used in abstract classes OR abstract interfaces
 	default = used in interface to provide DEFAULR implement of methods for classes that implement the inter
 	synchronized = in multithreaded code
 	
 	final + abstract = not compatible
 */
