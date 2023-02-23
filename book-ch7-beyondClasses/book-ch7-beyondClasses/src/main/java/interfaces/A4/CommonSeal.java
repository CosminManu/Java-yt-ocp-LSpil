package interfaces.A4;

public class CommonSeal extends HarborSeal {

	@Override
	public int getTailLength() {
		return 0;
	}

	
	@Override
	public int getNumberOfWhiskers() {
		return 0;
	}
}

/*
	Concrete Class must override ALL inherited abstract methods
	
	a class			an interface
			-----> implements
			
	an interface extend -----> interface
	
	an interface   ---\--> class (NOT)
*/
