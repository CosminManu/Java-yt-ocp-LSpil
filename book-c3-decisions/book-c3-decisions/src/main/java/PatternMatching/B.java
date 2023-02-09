package PatternMatching;

public class B {
	
	void printINtegersGreaterThan5(Number number){
		if(number instanceof Integer data && data.compareTo(5) > 0){		// data > 5
			System.out.println(data);
		}
	}

}
/*
x.compareTo(y) => 
=>	1 when x > y
	0 when x = y;
	-1 when x < y
	
 */