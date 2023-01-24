package overloading;

import anonymousBlocks.Cat;

public class main {

	static public void main(String... avfdjk) {
		System.out.println();
		
		A a = new A();

		a.a();
		System.out.println(  a.a(10)  );
		a.a(10, 10.0);

		// null = value that represents the absence
		// 		of the reference for an obj variable

//		a.a((int) null);
//		a.a((double) null);			ERR  Inconvertible types;
		
//		a.a(null);					ERR Ambiguous method call. Both a (String) and a (Cat) match
		a.a((String) null);
		a.a((Cat) null);
		A.a(null, 14.659);
		
		
		String sfjanf = null;
		Cat c = null;
		// NULL can be assigned to ANY OBJECT TYPE variable
		
	}
}
