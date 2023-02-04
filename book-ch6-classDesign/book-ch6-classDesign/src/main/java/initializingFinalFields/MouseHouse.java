package initializingFinalFields;

public class MouseHouse {
	
	private final int volume;
	private final int brothers;
	
	private final String name = "Mickey Mouse the fucker";	// assign value to final at moment of declaration
	
	public MouseHouse(int brothers) {
		this.brothers = brothers;
	}
	{
		volume = (int) 10.0;		// assign value to final at instance initializer
	}	// instance initializer
	
	public MouseHouse(){
//		this.name = "Coi";		// final NAME variab ALREADY assigned 
//		this.volume = 10.0;		// final variab already assigned 

//		this.brothers = 20; 
		
		this(0);
	}	
}

/*
By the time each and every ctor ends
ALL FINAL VARIAB must be assigned a value
 */
