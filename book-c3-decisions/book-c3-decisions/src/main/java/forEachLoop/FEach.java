package forEachLoop;

import java.util.List;
import java.util.Map;

public class FEach {
	
//	for(datatype instance : collection){
//		// body ...
//	}
	
	//traditional for (with i)
	void printNames(String[] names){
		for(int i = 0; i< names.length; i++){
			System.out.println(names[i]);
		}
	}
	
	void printNames2(String[] names){
		for(var name : names){
			System.out.println(name);
		}
	}
	void printNames3(List<String> names){
		for(var name : names){
			System.out.println(name);
		}
	}
	/* on each iteration, a for each loop 
	assigns a variable with the same type as the generic argument from right
	Arguments can be: array, List, Set (ALL that implement/extend the Collection Interface*/
	
	// foreach not applicable to type 'java.util.Map'
//	void printNames4(Map<String, Integer> map){
//		for (var x : map){
//		}
//	}
}
