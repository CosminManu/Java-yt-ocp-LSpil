package OCPbook.overloading;

public class Falcon {
	/*
	Method overloading = methods in 
			SAME CLASS, SAME NAME (doesn't matter :
			- access modifier;
			-  return type; 
			-  exception list)
			BUT DIFFERENT SIGNATURES (method param) => type || no of param || order
	 */
	
	// 5 overloaded methods
	public void fly(int numMiles){}
	public void fly(short numFeet){}	// OK overloading -> diff type (short != int)	
	void fly(Integer i){}				// OK -> diff type
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet){};		// OK -> no of params (2)
	void fly(short numFeet, int numMiles) throws Exception{};		// OK -> order of params (short,int != int,short)
	
	
//	void fly(){}						// ERR 'fly()' is already defined (public boolean fly(){..})
//	public void fly(int numFeet){}		// ERR 'fly(int)' is already defined
//	void fly(int a){}					// ERR 'fly(int)' is already defined  
	
	
}
