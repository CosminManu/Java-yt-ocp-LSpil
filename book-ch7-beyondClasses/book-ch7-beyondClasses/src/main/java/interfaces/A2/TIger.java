package interfaces.A2;

public class TIger implements Herbivore, Omnivore {
	private int hunger = 10;

	@Override
	public Integer eatPlants() {
		System.out.println("Tiger hast Hunger.");
		return hunger;
	}
	
	
}
/*
	both methods from the interfaces
	MUST have compatible return types (covariant)
	in order to be both implemented in concrete class
	
	Covariant = casts to the narrower type
		Object -> Integer
		
	Implicit modifiers = ones that compiler will auto insert
	1) interfaces are implicitly abstract
	2) variables are implicitly public, static, final
	3) All methods without a body are abstract *	==> no body (unless it's PRIVATE method)
	4) All methods without access modifier are public
	
 */
