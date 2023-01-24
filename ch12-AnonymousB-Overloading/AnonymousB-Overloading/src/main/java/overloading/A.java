package overloading;

import anonymousBlocks.Cat;

public class A {
	
	void a() {}
//	void a(int x) {}
//	TYPE OF METHOD is not important when discussing correct overloading
	
	/*
	OVERLOADING
	- type & order & number of the parameters
	- TYPE OF METHOD is not important
	 */
	
	int a(int x){return x;}
	
	void a(double x){}
	
//	static void a(double x){}		ERR 'a(double)' is already defined
	
	void a(int m, double n){
		System.out.println(n);
	}
	
	static void a(String p, double o){
		System.out.println(p);
	}
	
//	void a(String z, double zz){}		//		ERR 'a(String, double)' is already defined in 'overloading.A'

	void a(double o, String p){}	
	
	void a(String s){}
	
	void a(Cat cat){}

}
