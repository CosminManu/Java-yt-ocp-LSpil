package unreachableCode;

public class A {
	
	int c = 10;
	void f(){
		while (c < 100){
			c++;
			if(c > 80){
				break;
//				c++;		// ERR Unreachable statement
			}
		}
	}
}
