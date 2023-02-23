package immutableObj.defensiveCopy;

import java.util.ArrayList;
import java.util.List;

public final class Animal {		// not an immutable object declaration

	private final List<String> favouriteFoods;

	public Animal(ArrayList<String> favouriteFoods) {
		if(favouriteFoods == null || favouriteFoods.size() == 0){
			throw new RuntimeException("the list of the food is empty");
		}
		this.favouriteFoods = new ArrayList<>(favouriteFoods);	
		// defensive copy
		// the copy is being made in case the code does something unexpected
	}
	
	public int getFavouriteFoodsCount(){
		return favouriteFoods.size();
	}
	
	public String getFavouriteFoodsItem(int index){
		return favouriteFoods.get(index);
	}
}

/*
	Immutable object because
	the mutable variable cannot be modified by the caller 
 */

