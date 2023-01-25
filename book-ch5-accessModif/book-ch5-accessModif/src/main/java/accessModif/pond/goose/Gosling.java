package accessModif.pond.goose;

import accessModif.pond.mainland.Bird;

	/*  extends means creating a subclass that has
	access to ANY PROTECTED / PUBLIC members of parent class */
public class Gosling extends Bird {
	public void swim(){
		floatInWater();
		System.out.println(ability);
//		System.out.println(name);		ERR  package
	}
	/* members are used without referring to a variable (..=new..)
	protected access is allowed */
	
	static public void main(String a[]){
		Gosling g = new Gosling();
		g.swim();					// al lui
		g.floatInWater();			// protected
		g.ability = "fly";			// protected
		
//		g.name = "afs";				// ERR package
		
		Bird bird = new Bird();
		bird.pub = false;
	}
	
	/* members are used through a variable
	* in this case the rules for the reference type of the variable
	* matter.
	*  1) If the class of the variable INHERITS (i.e. is a subclass, it extends from others)
	* 		=> protected access is allowed   
	*  2) If the class of the variable DOESN'T INHERIT ( not a subclass etc) 
	* 		=> 2nd level of access restriction 
	* 		=> package access is allowed */
	

}
