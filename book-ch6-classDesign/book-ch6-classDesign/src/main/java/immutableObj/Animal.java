package immutableObj;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

	private final List<String> favouriteFoods;

	public Animal() {
		this.favouriteFoods = new ArrayList<String>();
		this.favouriteFoods.add("Apples");
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

