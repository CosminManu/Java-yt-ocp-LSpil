package PatternMatching;

public class A1 {

	Integer value = 123;

	void function() {
		if (value instanceof Integer) {
			System.out.println(value);
		}
//		if(value instanceof Integer data){		// ERR  Pattern type 'Integer' is the same as expression type 'value'
//			System.out.println(data);
//		}
		
	}
}
