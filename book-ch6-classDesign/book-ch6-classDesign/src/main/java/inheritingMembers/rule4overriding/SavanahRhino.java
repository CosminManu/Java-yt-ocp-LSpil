package inheritingMembers.rule4overriding;

public class SavanahRhino extends Rhino{

	@Override
	public String getName(){
		return "Savanah rhino";
	}
	
	@Override
	public String getColor(){
		return "gray";
	}
//	@Override
//	public CharSequence getColor(){
//		return "gray";
//	}
}

/*
	Basically rule #4 for correctly overriding says this:
	
	The return type of the method from the child class MUST BE
		the same or a subtype of the return type of the method from parent class
		
	In this example SavanahRhino & Rhino, 
	CharSequence is not a subtype of String (not a type of the class String)
	 <=> the same as Rhino is not a type of SavanahRhino 
 */