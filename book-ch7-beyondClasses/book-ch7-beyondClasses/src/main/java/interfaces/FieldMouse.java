package interfaces;

public class FieldMouse implements Climb, CanBurrow {

	/**
	 * @param age
	 * @return number
	 */
	@Override
	public Float getSpeed(int age) {
		return 10F;
	}
	// overriding 2 abstract methods from 2 interfaces
	//with only 1 implementation
}

/*
INterfaces simply define a set of rules and methods 
that a class implementing it must follow
 */
